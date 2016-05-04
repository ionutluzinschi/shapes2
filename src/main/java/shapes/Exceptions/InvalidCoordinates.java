package shapes.Exceptions;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class InvalidCoordinates extends Exception {
    private double x;
    private double y;
    private boolean both=false;
    public InvalidCoordinates(double x, double y){
        this.x=x;
        this.y=y;
        both=true;
    }
    public InvalidCoordinates(double x){
        this.x=x;
    }

    public String toString(){
        if(both)
        return "Invalid coordinates x="+x+", y="+y;
        else
            return "Invalid coordinates x="+x;
    }

}
