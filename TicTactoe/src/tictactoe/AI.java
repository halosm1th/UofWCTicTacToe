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
    public int[][] gameBoard;
    public AI(int[][] gb){
        duplicateArray(gb, gameBoard);
    }

    public Coordinates getNextMove(){
        Coordinates returnCords = new Coordinates(0,0);
        
        return returnCords;
    }
    
    public boolean isValid(Coordinates c){
        if(gameBoard[c.getX()][c.getY()] == 0){
            return true;
        }else{
            return false;
        }
    }
  
    private void findMove(
    ){ // Method for finding the best move to take by the computer. Searches 3(?) deep.
      for (int x = 0; i < 3; i++) {  //cycle through 3 rows
         for (int y = 0; y < 3; y++) { //cycle through 3 collumns
           gameBoard[x][y] = 2;
           //check win
           gameBoard[x][y] = 0;
         }
       }
    }
  
  private void duplicateArray(int[][] inArray, // array to copy from
                              int[][] outArray // array to copy to
                             ) {
    for (int i = 0; i < inArray.
  }




}