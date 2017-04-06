/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;


/**
 *
 * @author Halo
 */
public class AI {
    public AI(){
    }

    public Coordinates getNextMove(){
        Coordinates returnCords = new Coordinates(0,0,4);
        
        return returnCords;
    }
    
    public boolean isValid(char[][] gb, Coordinates c){
        if(gb[c.getX()][c.getY()] == 0){
            return true;
        }else{
            return false;
        }
    }
  
    private Coordinates findMove(char[][] gb
    ){ // Method for finding the best move to take by the computer.
        
      char[][] gameBoard = new char[gb.length][gb[0].length];
      
      duplicateArray(gb, gameBoard);
      
      for (int x = 0; x < 3; x++) {  //cycle through 3 rows
         for (int y = 0; y < 3; y++) { //cycle through 3 collumns
           Coordinates pos = new Coordinates(x, y);
           if(isValid(gameBoard, pos)){
            gameBoard[pos.getX()][pos.getY()] = 2;
            //check state, return win/draw/cont;
            //if not win
                //do cycle on node for player
            //if all are cont
                //do cycle on node again
                findMove(gb); //current state of board
            //if lose
                //end
           
            // for all conts, check for full board. if full stop
            //if win: end tree and make move
            return(pos);
            //if loss: do not look further in tree >how?
            //if draw: look for other moves
            //if cont: look for other moves
            
            
            }
         }
       }
      return(null);
    }
  
  private void duplicateArray(char[][] inArray, // array to copy from
                              char[][] outArray // array to copy to
    ) {
    // Method duplicates a 2d int array from inArray to outArray
      
    inArray = outArray.clone();
      
    for (int i = 0; i < inArray.length; i++){
        outArray[i] = inArray[i].clone();
    } 
  }

}