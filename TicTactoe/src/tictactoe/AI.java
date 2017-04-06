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

import Checker.checkWin;

public class AI {
    public AI(gameBoard gbIn){
    
    gameBoard gb = gbIn;
        
    }

    public Coordinates getNextMove(gameBoard gb){
        Coordinates returnCoords = new Coordinates(0,0);
        
        returnCoords = findMove(gb);
        
        return returnCoords;
    }
    
    public boolean isValid(gameBoard gb, Coordinates c){
        return (gb.getCoor(c.getX(), c.getY()) == 'N'); // returns true / false
                                                        // for an open tile
    }
  
    private Coordinates findMove(gameBoard gb
    ){ // Method for finding the best move to take by the computer.
      checkWin u = new checkWin();
      gameBoard g = new gameBoard();
      
      duplicateArray(gb, g);
      
      for (int x = 0; x < g.getSize(); x++) {  //cycle through 3 rows
         for (int y = 0; y < g.getSize(); y++) { //cycle through 3 collumns
           Coordinates pos = new Coordinates(x, y);
           
           /* Checks to see if the given x / y is an empty tile ('N')*/
           
           if(isValid(g, pos)){
               
               /*Sets the position to be AI*/
               
            g.setCoor(x, y, 'O');
            
               /*Checks the position to see if the move would result in a win*/
            
            if (u.isWin(g) == 'O') {
                /* if it is a win, immediately return the Coordinates with the
                win flag included */
                pos.setWinLoss('O');
                return (pos);
           } else {
                for (int xP = 0; xP < g.getSize(); xP++) {  //cycle through 3 rows
                    for (int yP = 0; yP < g.getSize(); yP++) { //cycle through 3 collumns
                        Coordinates posP = new Coordinates(xP, yP);
                         
                        /* Checks to see if the given x / y is
                        an empty tile ('N')*/
                        
                        if(isValid(g, posP)){
               
                            /*Sets the position to be player*/

                         g.setCoor(posP.getX(), posP.getY(), 'X');

                            /*Checks the position to see if
                         the move would result in a win*/

                         if (u.isWin(g) == 'X') {
                             /* if it is a win, immediately reset the board,
                             break the chain back to the first x/y cycle
                             and look for a new move */
                             g.setCoor(pos.getX(), pos.getY(), 'N');
                             g.setCoor(posP.getX(), posP.getY(), 'N');
                             // Thomas make do! #######################################################################################
                        } else {
                             
                         }
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
  
  private void duplicateArray(gameBoard in, // array to copy from
                              gameBoard out // array to copy to
    ) {
    // Method duplicates a 2d int array from inArray to outArray
      for (int x = 0; x < out.getSize(); x ++) {
          for (int y = 0; y < out.getSize(); y++) {
              char f = in.getCoor(x, y);
              out.setCoor(x, y, f);
          }
              
    }
  }
}