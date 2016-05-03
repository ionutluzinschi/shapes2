package shapes.shapes2D.rectangle;

import shapes.shapes2D.Shapes2D;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 5/3/2016.
 */
public abstract class Rectangular extends Shapes2D {
    protected double length;
    protected Point upperLeft;
    public double getLength(){
        return length;
    }

    public Point getCoordinates(){
        return upperLeft;

    }

}
