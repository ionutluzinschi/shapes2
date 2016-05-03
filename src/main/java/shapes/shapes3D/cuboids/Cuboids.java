package shapes.shapes3D.cuboids;

import shapes.shapes3D.Shapes3D;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 5/3/2016.
 */
public abstract class Cuboids extends Shapes3D {
    protected double length;
    protected Point3D upperLeft;

    public double getLength(){
        return length;
    }
    public Point3D getCoordinates(){
        return upperLeft;
    }
    public void setStart(Point3D x){
        upperLeft=x;
    }

}
