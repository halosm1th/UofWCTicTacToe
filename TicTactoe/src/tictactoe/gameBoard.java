/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacgamecode;

/**
 *
 * @author Colin
 */
public class gameBoard {// start class gameBoard
    
    private final int SIZE = 3;          //size of the gamebaords hieght and width
    
    
    private char [][] boardMatrix = new char [SIZE][SIZE];     //this is a 2d 
                                    //array of the gameboard in booleans X is x
                                    //ans O is o and N is no character

    public gameBoard(){//start matrix contructor
        
    }//end matrix constructor
    
    public char[][] getBoard(){//start getBoard
        return boardMatrix;
    }//end getBoard
    
    protected void resetBoard(){//start resetBoard this is self explanitory
        for(int i = 0; i < SIZE; i++){//start for rows
            for(int j = 0; j < SIZE; i++){//start for columns
                boardMatrix[i][j] = 'N';
            }//end for columns
        }//end for rows
    }//end resetBoard
    
    
    protected void addPiece(int coorRows, int coorCol, boolean turn){//start 
                                    //addPiece which places a piece on the board
        if(boardMatrix[coorRows][coorCol] == 'N'){//start if 
            if(turn){
                boardMatrix[coorRows][coorCol] = 'X';
            }
            else{
                boardMatrix[coorRows][coorCol] = 'O';
            }
            System.out.println("piece added");
        }//end if 
        else{//start else
            System.out.println("Well, there was a bit of a SNAFU \n(check your"
                    + " code)");
        }//end else
        
    }//end add piece 
    
    private char whoWon(int row, int column){
        return boardMatrix[row][column];
    }
    
    private boolean checkRow(int rowNum){//start checkRow
        boolean row = false;
        if(boardMatrix[rowNum][0] == boardMatrix[rowNum][1] && 
                boardMatrix[rowNum][1] == boardMatrix[rowNum][2]){//start if 
            row = true;
        }//end if 
        return row;
    }//end checkRow
    
    private boolean checkColumn(int columnNum){
        boolean column = false;
        if(boardMatrix[0][columnNum] == boardMatrix[1][columnNum] && 
                boardMatrix[1][columnNum] == boardMatrix[2][columnNum]){//start if 
            column = true;
        }//end if 
        return column;
    }
    
    private boolean checkDiagonals(){//start checkDiagonals
        boolean diagWin = false;
        
        //just trust me on this one alright
        if((boardMatrix[2][2] == boardMatrix[1][1] && 
                boardMatrix[1][1] == boardMatrix[0][0]) ||
                (boardMatrix[0][2] == boardMatrix[1][1] && 
                boardMatrix[1][1] == boardMatrix[2][0])){//start if
            diagWin = true;
        }//end if
        
        return diagWin;
    }//end checkDiagonals
    
    private boolean checkDraw(){//start checkDraw
       boolean isDraw = false;
       int i = 0;
       int j = 0;
       
       while(isDraw == false || i < SIZE){//start while rows
           while(isDraw == false || j < SIZE){//start while columns
               if(boardMatrix[i][j] == 'N'){//start if space occupied
                   isDraw = true;
               }//end if space occupied
               j++;
           }//end while columns
           j = 0;
           i++;
       }//end while rows 
       
       return isDraw;
    }//end checkDraw
    
    //this will return X for human win O for machine win D for draw and N for no win
    protected char isWin(){//start isWin
        char win = 'N';    
        int i = 0; 
        
        do{//start do while
            if(checkRow(i)){//start if theres a win in rows
                win = whoWon(i, 0);
            }//end if theres a win in rows
            i++;
        }while(win == 'N' || i < SIZE);//end do while
        
        i = 0;
        while(win == 'N' || i < SIZE){//start while
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
    
    
    //so this funciton, isWin, determines if there has been a win and will 
    //return a char telling you who won or if no one won
    
    
    /*
    protected char isWin(){//start isWin will determine if theres a win
        char win = WINCONDNO;
        int i;
        
        //this while loop will check all the rows for wins
        i = 0;
        
        
        
        while(win == WINCONDNO || i < SIZE){
        //for(int i = 0; i < SIZE; i++){//start for
            if((validMatrix[i][2] && validMatrix[i][1] && validMatrix[i][0])){//start if valid
                if(boardMatrix[i][2] && boardMatrix[i][1] && boardMatrix[i][0]){//start if win human
                    win = WINCONDHU;
                }//end if win human
                else if(!boardMatrix[i][2] && !boardMatrix[i][1] && !boardMatrix[i][0]){//start if win machine
                    win = WINCONDMA;
                }//end if win machine
            }//end if valid
            i++;
        }//end while
        
        //this while loop will check all the columns for wins
        i = 0; 
        while(win == WINCONDNO || i < SIZE){
        //for(int i = 0; i < SIZE; i++){//start for
            if((validMatrix[2][i] && validMatrix[1][i] && validMatrix[0][i])){//start if valid
                if(boardMatrix[2][i] && boardMatrix[1][i] && boardMatrix[0][i]){//start if win human
                    win = WINCONDHU;
                }//end if win human
                else if(!boardMatrix[2][i] && !boardMatrix[1][i] && !boardMatrix[0][i]){
                    win = WINCONDMA;
                }
            }//end if valid
            i++;
        }//end while
        
        if(win == WINCONDNO){//start if no win yet
            if((validMatrix[2][2] && validMatrix[1][1] && validMatrix[0][0])){//start if diagonal valid 1
                if(boardMatrix[2][2] && boardMatrix[1][1] && boardMatrix[0][0]){//start if win diagonal 1 human
                    win = WINCONDHU;
                }//end if win diagonal 1 human
                else if(!boardMatrix[2][2] && !boardMatrix[1][1] && !boardMatrix[0][0]){//start else if win diagonal 1 machine
                    win = WINCONDMA;
                }//end else if win diagonal 1 machine
            }//end if diagonal valid 1
        }//end if no win yet
        if(win == WINCONDNO){//start second if no win yet
            if(validMatrix[2][0] && validMatrix[1][1] && validMatrix[0][2]){//start if diagonal valid 2 human
                win = WINCONDHU;
            }//end if diagonal valid 2 human
            else if(!validMatrix[2][0] && !validMatrix[1][1] && !validMatrix[0][2]){//start else if win diagonal 2 machine
                win = WINCONDMA;
            }//end else if win diagonal 2 machine
        }//end second if no win yet
        return win;

    }//end isWin
    */
}//end class gameBoard
