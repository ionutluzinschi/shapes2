package shapes.shapes2D.round;

import shapes.Exceptions.InvalidRadius;
import shapes.shapes2D.Shapes2D;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 5/3/2016.
 */
public abstract class Round extends Shapes2D {
    protected double radius;
    protected Point center;

    public double getRadius(){
            return radius;
    }

    public void setRadius(double z) throws InvalidRadius{
        if(radius<0)
            throw new InvalidRadius(z);
                radius=z;
    }

    public Point getCenter() {
        return center;
    }
    public void setCenter(Point x) {
        center = x;

    }

}
