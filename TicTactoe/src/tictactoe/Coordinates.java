// Co-ordinates class that gets and passes the input cell

package tictactoe;

public class Coordinates {
    
    private int x;
    private int y;
    private char winLoss;
    
    public Coordinates(int _x, int _y, char _winloss){
    }
    
    public Coordinates(int _x, int _y){
    }
    
    //deal with it
    public void setWinLoss(char wL){//start setWinLoss
        winLoss = wL;
    }//end setWinLoss
    
    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }

    public char getWinLoss(){return winLoss;}

    public String toString(){
        return "" + getX() + " " + getY() + " " + getWinLoss();
    }
}