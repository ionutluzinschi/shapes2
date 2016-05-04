package shapes.Exceptions;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class InvalidRadius extends Exception {
    private double radius;
    public InvalidRadius(double radius){
        this.radius=radius;
    }

    public String toString(){
        return "Invalid radius: "+radius;
    }
}
