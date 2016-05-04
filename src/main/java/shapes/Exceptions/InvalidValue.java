package shapes.Exceptions;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class InvalidValue extends Exception {
    private double value;

    public InvalidValue(double x){
        value=x;
    }
    public String toString(){
        return "Invalid or negative value: "+value;
    }

}
