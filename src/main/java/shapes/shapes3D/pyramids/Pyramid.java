package shapes.shapes3D.pyramids;

import shapes.Shape;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Pyramid extends Pyramids {
    private double width;

    public Pyramid(){
        length=5;
        width=5;
        tip=new Point3D();
        initialised=true;
        name="Pyramid";
        base=new Point3D(5,5,5);
    }
    public Pyramid(String name){
        this.name=name;
        length=5;
        width=5;
        tip=new Point3D();
        initialised=true;
        base=new Point3D(5,5,5);
    }
    public Pyramid(Point3D tip,Point3D base, double length,double width){
        if(tip.getX() >= 0 && tip.getY() >= 0 && tip.getZ() >= 0 && length > 0 && base.getX()>0 &&base.getZ()>0 &&base.getY()>0 && width>0) {
            this.tip=tip;
            this.base=base;
            this.length = length;
            this.width = width;
            initialised = true;
            name="Pyramid";
        }
    }

    public Pyramid(Point3D tip,Point3D base, double length,double width,String name){
        if(tip.getX() >= 0 && tip.getY() >= 0 && tip.getZ() >= 0 && length > 0 && base.getX()>0 &&base.getZ()>0 &&base.getY()>0 && width>0) {
            this.tip=tip;
            this.base=base;
            this.name=name;
            this.length = length;
            this.width = width;
            initialised = true;
        }

    }
    public void setWidth(double width){
        if(initialised && width>0)
            this.width=width;
    }


    public double getWidth(){
        if(initialised)
            return width;
        else
            return 0;
    }

    public String toString(){
        if(initialised){
            return name+":["+tip+" "+length+" "+width+"]";
        }
        else
            return "Pyramid not initialised";
    }
}
