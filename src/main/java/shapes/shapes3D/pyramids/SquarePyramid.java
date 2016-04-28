package shapes.shapes3D.pyramids;

import shapes.shapes2D.rectangle.Square;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class SquarePyramid  {
    private double length;
    private Point3D tip;
    private boolean initialised=false;

    public SquarePyramid(){
        length=5;

        tip=new Point3D();
        initialised=true;
    }
    public SquarePyramid(Point3D point,double length){
        tip=point;
        if(length>0)
            this.length=length;
        else
            this.length=5;
        initialised=true;

    }
    public SquarePyramid(double x,double y,double z,double length){
        tip=new Point3D(x,y,z);
        if(length>0)
            this.length=length;
        else
            this.length=5;
        initialised=true;
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
    public void draw(){

    }

    public String toString(){
        if(initialised){
            return "Square pyramid has base length of "+length+" and the tip at coordinates "+tip;
        }
        else
            return "square pyramid not initialised";
    }


}
