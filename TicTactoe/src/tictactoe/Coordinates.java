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
public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int _x, int _y){
        x = _x;
        y = _y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}