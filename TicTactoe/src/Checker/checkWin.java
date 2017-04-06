/*
 * TAnd with a little bit of help form an a-dapter kit we had that engine 
 *  just like a song!
 */
package Checker;


//this is the enormous list of imports (wow sarcasm is hard to convey in just text)
import tictactoe.gameBoard;

/**
 *
 * @author Colin
 */
public class checkWin {//start public class checkWin
    private gameBoard gb = new gameBoard();
    //private final 
    
    public checkWin(){//start constructor
        //when I was just a baby my mama told me "son,always be a good boy dont  
        //ever play with guns"
        //but I shot a man in Reno just to watch him die 
    }//end constructor
    
    private char whoWon(int row, int column){//start who won
        return gb.getCoor(row, column);
        //return boardMatrix[row][column];
    }//end who won
    
    private boolean checkRow(int rowNum){//start checkRow
        boolean row = false;
        if(gb.getCoor(rowNum, 0) == gb.getCoor(rowNum, 1) && 
                gb.getCoor(rowNum, 1) == gb.getCoor(rowNum, 2)){//start if 
            row = true;
        }//end if 
        return row;
    }//end checkRow
    
    private boolean checkColumn(int columnNum){//start checkColumn
        boolean column = false;
        if(gb.getCoor(0, columnNum) == gb.getCoor(1, columnNum) && 
                gb.getCoor(1, columnNum) == gb.getCoor(2, columnNum)){//start if 
            column = true;
        }//end if 
        return column;
    }//end check column
    
    private boolean checkDiagonals(){//start checkDiagonals
        boolean diagWin = false;
        
        //just trust me on this one alright
        if((gb.getCoor(2, 2) == gb.getCoor(1, 1) && 
                gb.getCoor(1, 1) ==  gb.getCoor(0, 0)) ||
                (gb.getCoor(0, 2) == gb.getCoor(1, 1) && 
                gb.getCoor(1, 1) == gb.getCoor(2, 0))){//start if
            diagWin = true;
        }//end if
        
        return diagWin;
    }//end checkDiagonals
    
    private boolean checkDraw(){//start checkDraw
       boolean isDraw = false;
       int i = 0;
       int j = 0;
       
       while(isDraw == false || i < gb.SIZE){//start while rows
           while(isDraw == false || j < gb.SIZE){//start while columns
               if(gb.getCoor(i, j) == 'N'){//start if space occupied
                   isDraw = true;
               }//end if space occupied
               j++;
           }//end while columns
           j = 0;
           i++;
       }//end while rows 
       
       return isDraw;
    }//end checkDraw
    
    public char isWin(gameBoard _gB){//start isWin
        gb = _gB;
        char win = 'N';    
        int i = 0; 
        
        do{//start do while
            if(checkRow(i)){//start if theres a win in rows
                win = whoWon(i, 0);
            }//end if theres a win in rows
            i++;
        }while(win == 'N' || i < gb.SIZE);//end do while
        
        i = 0;
        while(win == 'N' || i < gb.SIZE){//start while
            if(checkColumn(i)){
                win = whoWon(0, i);
            }
            i++;
        }//end while
        
        if(checkDiagonals() && win == 'N'){//start if check diags
            win = whoWon(1, 1);
        }//end if check diags
        
        if(checkDraw() && win == 'N'){//start if to check draw
            win = 'D';
        }//end if to check draw
        
        return win;
    }//end isWin
}//end public class check win
