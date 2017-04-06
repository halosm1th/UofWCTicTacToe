/*
 * sup my dudes, this has been updated still unsure if this is the end of 
 * updates (I doubt it) but this should be good to go for now
 */
package tictactoe;

/**
 *
 * @author Colin
 */
public class gameBoard {// start class gameBoard
    
    public final int SIZE = 3;          //size of the gamebaords hieght and width
    
    //private char gameState  = 'N';
    private char [][] boardMatrix = new char [SIZE][SIZE];     //this is a 2d 
                                    //array of the gameboard in booleans X is x
                                    //ans O is o and N is no character

    public gameBoard(){//start matrix contructor
        //How many roads must a man walk down before you call him a man
        //How many seas must a white dove sail Before she sleeps in the sand?
    }//end matrix constructor
    
    public char[][] getBoard(){//start getBoard
        return boardMatrix;
    }//end getBoard
    
    public int getSize(){//return size of board (for AI -Cr)
        return SIZE;
    }//end getSize
    
    //returns value at specified coordinates 
    public char getCoor(int x, int y){// start getCoor
        return boardMatrix[x][y];
    }//end getCoor
    
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
    
    public void setCoor(int x, int y, char f){//set a specific tile without changing the above (-Cr)
        boardMatrix[x][y] = f;
    }//end setCoordsz
    
}//end class 
