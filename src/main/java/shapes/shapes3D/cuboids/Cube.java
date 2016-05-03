package shapes.shapes3D.cuboids;

import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes3D.Shapes3D;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cube extends Cuboids {


    public Cube(){
        name="Cube";
        upperLeft=new Point3D();
        length=5;
        initialised=true;
    }
    public Cube(String name){
        this.name=name;
        upperLeft=new Point3D();
        length=5;
        initialised=true;
    }

    public Cube(Point3D x,double length) {
        if (x.getX() > 0 && x.getY() > 0 && x.getZ() > 0 && length >0) {
            upperLeft = x;
            name = "Cube";
            this.length = length;
            initialised = true;
        }
    }
    public Cube(Point3D x,double length,String name) {
        if (x.getX() > 0 && x.getY() > 0 && x.getZ() > 0 && length > 0) {
            this.name = name;
            upperLeft = x;
            this.length = length;
            initialised = true;
        }
    }


    public String toString(){
        if(initialised)
            return name+":["+upperLeft+" "+length+"]";
        else
            return "Cube not initialised;";

    }

}
