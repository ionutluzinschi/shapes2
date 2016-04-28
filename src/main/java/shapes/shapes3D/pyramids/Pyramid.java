package shapes.shapes3D.pyramids;

import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Pyramid {
    private double length;
    private double width;
    private Point3D tip;
    private boolean initialised=false;

    public Pyramid(){
        length=5;
        width=5;
        tip=new Point3D();
        initialised=true;
    }
    public Pyramid(Point3D point,double length,double width){
        tip=point;
        if(length>0)
            this.length=length;
        else
            this.length=5;

        if(width>0)
            this.width=width;
        else
            this.width=5;

        initialised=true;

    }
    public Pyramid(double x,double y,double z,double length,double width){
        tip=new Point3D(x,y,z);
        if(length>0)
            this.length=length;
        else
            this.length=5;

        if(width>0)
            this.width=width;
        else
            this.width=5;

        initialised=true;
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
        if(initialised)
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
    public void draw(){

    }

    public String toString(){
        if(initialised){
            return "Pyramid has base length of "+length+"and base width of"+width+" and the tip at coordinates "+tip;
        }
        else
            return "Pyramid not initialised";
    }
}
