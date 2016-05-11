package shapes.shapes3D.round3D;

import shapes.shapes3D.Shapes3D;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 5/3/2016.
 */
public abstract class Round3D extends Shapes3D {
    protected double radius;
    protected Point3D start;
    public double getRadius(){
        return radius;
    }

    public Point3D getStart(){
        return start;
    }

    public void setStart(Point3D start) {
        this.start=start;
    }

}
