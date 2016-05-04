package shapes.Exceptions;

import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class OutOfBounds extends Exception {
    private double length;
    private Point x;
    private Point y;
    public OutOfBounds(double length, Point x,Point y){
        this.x=x;
        this.y=y;
        this.length=length;
    }

    public String toString(){
        return "Length out of bounds: "+length+", "+x+", "+y;
    }

}

