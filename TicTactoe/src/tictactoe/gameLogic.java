/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import Checker.checkWin;
/**
 *
 * @author Colin
 */
public class gameLogic {//start gameLogic 
    
    private Coordinates coors;              //not sponsored
        private gameBoard mainGame = new gameBoard();   //def need this though this is 
                                                //the game board
        private checkWin check = new checkWin();//new instance of checkWin
        private char state;                     //state of game not new york
    
        protected gameLogic(){//start constructor
            //when will you realize Vienna waits for you
        }//end constructor 
        
        protected Coordinates meth(Coordinates coorsLite){//start meth
            coors = coorsLite;
            mainGame.addPiece(coorsLite.getY(), coorsLite.getX(), true);
            state = check.isWin(mainGame);
            
            if(state != 'N'){//start if 
                coors = new Coordinates(coors.getX(), coors.getY(), state);
            }//end if
            else{//star else
                gameBoard dummyBoard = mainGame;
                coors = passBoard(dummyBoard);      //AI people, please write this function or eqivilent
            }//end else 
            return coors;
        }//end meth
    
}//end gameLogic
