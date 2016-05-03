package shapes.shapes3D.pyramids;

import shapes.Shape;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Pyramid extends Shape {
    private double length;
    private double width;
    private Point3D tip;

    public Pyramid(){
        length=5;
        width=5;
        tip=new Point3D();
        initialised=true;
        name="Pyramid";
    }
    public Pyramid(String name){
        this.name=name;
        length=5;
        width=5;
        tip=new Point3D();
        initialised=true;
    }
    public Pyramid(Point3D point,double length,double width){
        if(point.getX()>=0 && point.getY()>=0 && point.getZ()>=0 &&length>0 && width>0) {
            tip = point;
            this.length = length;
            this.width = width;
            initialised = true;
            name="Pyramid";
        }
    }

    public Pyramid(Point3D point,double length,double width,String name){
        if(point.getX()>=0 && point.getY()>=0 && point.getZ()>=0 &&length>0 && width>0) {
            this.name=name;
            tip = point;
            this.length = length;
            this.width = width;
            initialised = true;
        }

    }
    public Pyramid(double x,double y,double z,double length,double width) {
        if (x >= 0 && y >= 0 && z >= 0 && length > 0 && width > 0) {
            tip = new Point3D(x, y, z);
            this.length = length;
            this.width = width;
            initialised = true;
            name = "Pyramid";
        }
    }
    public Pyramid(double x,double y,double z,double length,double width,String name){
        if (x >= 0 && y >= 0 && z >= 0 && length > 0 && width > 0) {
        this.name=name;
        tip=new Point3D(x,y,z);
         this.length = length;
         this.width = width;
         initialised = true;
        }
    }

    public void setLength(double length){
        if(initialised && length>0)
            this.length=length;
    }
    public void setWidth(double width){
        if(initialised && width>0)
            this.width=width;
    }

    public void setTip(Point3D myPoint){
        if(initialised && myPoint.getZ()>=0 && myPoint.getY()>=0 && myPoint.getX()>=0)
            tip=myPoint;
    }


    public double getLength(){
        if(initialised)
            return length;
        else
            return 0;
    }
    public double getWidth(){
        if(initialised)
            return width;
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
            return name+":["+tip+" "+length+" "+width+"]";
        }
        else
            return "Pyramid not initialised";
    }
}
