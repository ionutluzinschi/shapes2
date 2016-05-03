package shapes.shapes3D.round3D;

import shapes.shapes3D.Shapes3D;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 5/3/2016.
 */
public class Round3D extends Shapes3D {
    protected double radius;
    protected Point3D start;
    public double getRadius(){
        return radius;
    }
    public void setStart(Point3D start){
        if(initialised && start.getX()>=0 && start.getZ()>=0 && start.getY()>=0)
            this.start=start;
    }
    public Point3D getStart(){
        return start;
    }

}
