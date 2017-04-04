// Co-ordinates class that gets and passes the input cell

package tictactoe;

public class Coordinates {
    
    private int x;
    private int y;

    protected Coordinates(int _x, int _y){
        x = _x;
        y = _y;
    }


    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }
}