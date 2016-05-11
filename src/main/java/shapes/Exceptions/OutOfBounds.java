package shapes.Exceptions;

import shapes.shapes2D.base.Point;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class OutOfBounds extends Exception {
    private double length;
    private Point x;
    private Point3D y;
    public OutOfBounds(double length, Point x){
        this.x=x;
        this.length=length;
    }
    public OutOfBounds(double length, Point3D y){
        this.y=y;
        this.length=length;
    }
    public String toString(){
        return "Length out of bounds: "+length+", "+x;
    }

}

