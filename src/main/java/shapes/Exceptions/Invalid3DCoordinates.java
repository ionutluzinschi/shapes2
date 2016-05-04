package shapes.Exceptions;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class Invalid3DCoordinates extends Exception {
    private double x;
    private double y;
    private double z;
    public Invalid3DCoordinates(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String toString(){
        return "Invalid 3D Coordinates : ("+x+","+y+","+z+")";
    }
}
