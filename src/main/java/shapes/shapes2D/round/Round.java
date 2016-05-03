package shapes.shapes2D.round;

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

    public void setRadius(double z){
        if(initialised){
            if(radius>0)
                radius=z;
        }
    }

    public Point getCenter() {
        return center;
    }
    public void setCenter(Point x) {
        if (initialised) {
            if (x.getX() > 0 && x.getY() > 0 &&  radius > x.getX() && radius > x.getY())
                center = x;
        }
    }

}
