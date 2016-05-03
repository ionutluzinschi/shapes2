package shapes.shapes3D.pyramids;

import shapes.Shape;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class SquarePyramid extends Shape {
    private double length;
    private Point3D tip;

    public SquarePyramid(){
        length=5;
        name="Square Pyramid";
        tip=new Point3D();
        initialised=true;
    }
    public SquarePyramid(String name){
        this.name=name;
        length=5;
        tip=new Point3D();
        initialised=true;
    }

    public SquarePyramid(Point3D point,double length) {
        if (point.getX() >= 0 && point.getY() >= 0 && point.getZ() >= 0 && length > 0) {
            name = "Square Pyramid";
            tip = point;
            this.length = length;
            initialised = true;
        }
    }


    public SquarePyramid(Point3D point,double length,String name){
        if (point.getX() >= 0 && point.getY() >= 0 && point.getZ() >= 0 && length > 0) {
            this.name = name;
            tip = point;
            this.length = length;
            initialised = true;
        }
    }
    public SquarePyramid(double x,double y,double z,double length) {
        if (x >= 0 && y >= 0 && z >= 0 && length > 0) {
            name = "Square Pyramid";
            tip = new Point3D(x, y, z);
            this.length = length;
            initialised = true;
        }
    }
    public SquarePyramid(double x,double y,double z,double length,String name) {
        if (x >= 0 && y >= 0 && z >= 0 && length > 0) {
            this.name = name;
            tip = new Point3D(x, y, z);
            this.length = length;
            initialised = true;
        }
    }

    public void setLength(double length){
        if(initialised && length>0)
            this.length=length;
    }

    public void setTip(Point3D myPoint){
        if(initialised)
            tip=myPoint;
    }


    public double getLength(){
        if(initialised)
            return length;
        else
            return 0;
    }

    public Point3D getTip(){
        if(initialised)
            return tip;
        else
            return new Point3D();
    }

    @Override
    public void draw(){

    }
    @Override
    public String toString(){
        if(initialised){
            return name+":["+tip+" "+length+"]";
        }
        else
            return "square pyramid not initialised";
    }


}
