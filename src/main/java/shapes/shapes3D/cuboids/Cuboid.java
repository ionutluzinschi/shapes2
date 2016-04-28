package shapes.shapes3D.cuboids;

import shapes.shapes2D.base.Point;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cuboid {
    private Point3D start;
    private double length;
    private double width;
    private double height;
    private boolean initialised=false;

    public Cuboid(){
        start=new Point3D();
        length=5;
        width=5;
        height=5;
        initialised=true;
    }

    public Cuboid(Point3D start, double length, double width,double height){
        this.start=start;

        if(length>0)
            this.length=length;
        else
            this.length=5;

        if(width>0)
            this.width=width;
        else
            this.width=5;
        if(height>0)
            this.height=height;
        else
            this.height=5;
        initialised=true;
    }

    public Cuboid(double x,double y,double z, double length, double width,double height){
        start=new Point3D(x,y,z);

        if(length>0)
            this.length=length;
        else
            this.length=5;

        if(width>0)
            this.width=width;
        else
            this.width=5;
        if(height>0)
            this.height=height;
        else
            this.height=5;
        initialised=true;
    }


    public Point3D getCoordinates(){
        if(initialised)
            return start;
        else
            return new Point3D();
    }
    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setStart(Point3D x){
        start=x;
    }
    public  void setStart(double x,double y,double z){
        start=new Point3D(x,y,z);
    }
    public void setLength(double length){
        if(length>0)
            this.length=length;
    }
    public void setWidth(double width){
        if(width>0)
            this.width=width;
    }
    public void setHeight(double height){
        if(height>0){
            this.height=height;
        }
    }
    public void draw(){

    }
    public String toString(){
        if(initialised)
            return "Cube has coordinates "+start+ " and length of "+length+" and height of"+height+" and width of "+width;
        return "Square not initialised";

    }



}
