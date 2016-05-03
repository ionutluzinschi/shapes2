package shapes.shapes3D.cuboids;

import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cube extends Shape {
    private double length;
    private Point3D start;

    public Cube(){
        name="Cube";
        start=new Point3D();
        length=5;
        initialised=true;
    }
    public Cube(String name){
        this.name=name;
        start=new Point3D();
        length=5;
        initialised=true;
    }

    public Cube(Point3D x,double length) {
        if (x.getX() > 0 && x.getY() > 0 && x.getZ() > 0 && length >0) {
            start = x;
            name = "Cube";
            this.length = length;
            initialised = true;
        }
    }
    public Cube(Point3D x,double length,String name) {
        if (x.getX() > 0 && x.getY() > 0 && x.getZ() > 0 && length > 0) {
            this.name = name;
            start = x;
            this.length = length;
            initialised = true;
        }
    }
    public Cube(double x,double y,double z,double length) {
        if (x > 0 && y > 0 && z > 0 && length>0) {
            start = new Point3D(x, y, z);
            this.length = 0;
            initialised = true;
        }
    }
    public Cube(double x,double y,double z,double length,String name) {
        if (x > 0 && y > 0 && z > 0 && length > 0) {
            this.name = name;
            start = new Point3D(x, y, z);
            this.length = length;
            initialised = true;
        }
    }

    public double getLength(){
        return length;
    }

    public Point3D getCoordinates(){
        return start;
    }
    @Override
    public void draw(){

    }

    @Override
    public String toString(){
        if(initialised)
            return name+":["+start+" "+length+"]";
        else
            return "Cube not initialised;";

    }

}
