package shapes.shapes3D;

import shapes.shapes2D.base.Point;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cone {
    private Point3D base;
    private Point3D tip;
    private int radius;
    private boolean initialised=false;
    public Cone(){
        base=new Point3D();
        tip=new Point3D();
        radius=5;
        initialised=true;
    }
    public Cone(Point3D base, Point3D tip, int radius){
        this.base=base;
        this.tip=tip;
        if(radius>0)
            this.radius=radius;
        else
            radius=5;
        initialised=true;
    }
    public void setBase(int x, int y, int z){
        if(initialised)
            base=new Point3D(x,y,z);
    }
    public void setBase(Point3D base){
        if(initialised)
    this.base=base;
    }
    public void setTip(int x,int y,int z){
        if(initialised)
            tip=new Point3D(x,y,z);
    }
    public void setTip(Point3D tip){
        if(initialised)
            this.tip=tip;
    }
    public void setRadius(int radius){
        if(initialised && radius >0 && radius <base.getZ() && radius<base.getY() && radius<base.getX())
            this.radius=radius;
    }
    public Point3D getBase(){
        if(initialised)
            return base;
        else
            return new Point3D();
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
        if(initialised)
            return "Cone has base at coordinates ("+base.getX()+","+base.getY()+","+base.getZ()+") and a radius of "+radius+
                    "and the tip at coordinates ("+tip.getX()+","+tip.getY()+","+tip.getZ()+")";
        else
            return "Cone not initialised";
    }
}
