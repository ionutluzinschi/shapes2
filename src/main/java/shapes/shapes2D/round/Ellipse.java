package shapes.shapes2D.round;

import shapes.Shape;
import shapes.shapes2D.Shapes2D;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Ellipse extends Round{
    private Point centerB;
  
    public Ellipse(){
        center=new Point();
        centerB=new Point();
        radius=5;
        initialised=true;
        name="Ellipse";
    }
    public Ellipse(String name){
        this.name=name;
        center=new Point();
        centerB=new Point();
        radius=5;
        initialised=true;
    }
    public Ellipse(Point x,Point y){
        if(x.getX()>0 && x.getY()>0 && y.getX()>0 &&y.getY()>0){
        center=x;
        centerB=y;
        radius=Math.abs(center.getY()-centerB.getY())+1;
        name="Ellipse";
        }
    }

    public Ellipse(Point x,Point y, String name) {
        if (x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
            this.name = name;
            center = x;
            centerB = y;
            radius = Math.abs(center.getY() - centerB.getY()) + 1;
        }
    }

    public Ellipse(Point x,Point y, double radius) {
        if (x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
            name = "Ellipse";
            center = x;
            centerB = y;
            if (radius > 0 && radius > center.getX() && radius > centerB.getX() && radius > center.getY() && radius > centerB.getY())
                this.radius = radius;
            else
                this.radius = 10 + Math.max(Math.max(center.getX(), center.getY()), Math.max(centerB.getX(), centerB.getY()));
            initialised = true;
        }
    }
    public Ellipse(Point x,Point y, double radius, String name) {
        if (x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
            this.name = name;
            center = x;
            centerB = y;
            if (radius > 0)
                this.radius = radius;
            else
                this.radius = 5;
            initialised = true;
        }
    }

    public void setFoci(Point x, Point y){
        if (initialised && x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
            center=x;
            centerB=y;
        }
    }

    public Point getCenterB(){
        return centerB;
    }

    public void setCenterB(Point x) {
        if (initialised) {
            if (x.getX() > 0 && x.getY() > 0 &&  radius > x.getX() && radius > x.getY())
                centerB= x;
        }
    }

    public String toString(){
        if(initialised)
            return name+":[("+center+","+centerB+") " +radius+"]";
        else
            return "Ellipse not initialised";

    }

}
