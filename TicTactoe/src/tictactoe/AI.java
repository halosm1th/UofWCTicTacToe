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
        gameBoard= gb;
    }

    public Coordinates getNextMove(){
        Coordinates returnCords = new Coordinates(0,0);

        return returnCords;
    }
}
