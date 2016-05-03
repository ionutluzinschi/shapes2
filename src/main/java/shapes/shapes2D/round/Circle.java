package shapes.shapes2D.round;
import shapes.Shape;
import shapes.shapes2D.Shapes2D;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Circle extends Round {




    public Circle() {
        center = new Point(50, 50);
        radius = 3 * Math.PI;
        initialised = true;
        name="Circle";
    }
    public Circle(String name) {
        this.name=name;
        center = new Point(50, 50);
        radius = 3 * Math.PI;
        initialised = true;
    }


    public Circle(double x, double y, double z) {

        if (x > 0 && y > 0 && z > 0 && x > z && y > z) {
            center = new Point(x, y);
            radius = z;
            initialised = true;
            name="Circle";
        }
    }
    public Circle(double x, double y, double z,String name) {

        if (x > 0 && y > 0 && z > 0 && x > z && y > z) {
            this.name=name;
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
            name="Circle";
        }

    }
    public Circle(Point x, double z,String name) {
        if (x.getX() > 0 && x.getY() > 0 && z > 0 && z > x.getX() && z > x.getY()) {
            this.name=name;
            center = x;
            radius = z;
            initialised = true;
        }

    }




    public String toString(){
        if (initialised)
        return name+":[("+center.getX()+","+center.getY()+"),"+radius+"]";

        else
            return "Circle not initialised";

    }


}
