// Co-ordinates class that gets and passes the input cell

public class Coordinates {
    
    private int x;
    private int y;
    private char winLoss;
    public Coordinates(int _x, int _y, char _winloss){

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