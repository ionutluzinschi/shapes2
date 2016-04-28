package shapes.shapes2D.round;
import shapes.shapes2D.Shape;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Circle implements Shape {
    private Point center;
    private double radius;
    private boolean initialised = false;

    public Circle() {
        center = new Point(50, 50);
        radius = 3 * Math.PI;
        initialised = true;
    }

    ;

    public Circle(double x, double y, double z) {

        if (x > 0 && y > 0 && z > 0 && x > z && y > z) {
            center = new Point(x, y);
            radius = z;
            initialised = true;
        }
    }

    public Circle(Point x, double z) {
        if (x.getX() > 0 && x.getY() > 0 && z > 0 && z > x.getX() && z > x.getY()) {
            center = x;
            radius = z;
            initialised = true;
        }

    }


    public void setCoordinates(double x, double y) {
        if (initialised) {
            if (x > 0 && y > 0 && x > radius && y > radius)
                center.setCoordinates(x, y);

        }
    }



    public void setCoordinates(Point x) {
        if (initialised) {
            if (x.getX() > 0 && x.getY() > 0 &&  radius > x.getX() && radius > x.getY())
                center = x;

        }
    }
    public void setRadius(double z){
        if(initialised){
            if(radius<center.getX() && radius <center.getY() && radius>0)
                radius=z;

        }
    }

    public Point getCoordinates() {
        if (initialised)
            return center;
        else
            return new Point(50,50);
    }
    public double getRadius(){
        if(initialised)
            return radius;
        else
            return 0;
    }


    public boolean getState(){
        return initialised;
    }
    public void draw(){
        //
    }

    public String toString(){
        if (initialised)
        return "Circle has center at ("+center.getX()+","+center.getY()+"), and a radius of "+radius;

        else
            return "Circle not initialised";

    }


}
