package shapes.shapes3D;

import shapes.Shape;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cone extends Shape {
    private Point3D base;
    private Point3D tip;
    private int radius;


    public Cone(){
        base=new Point3D();
        tip=new Point3D();
        radius=5;
        initialised=true;
        name="Cone";
    }
    public Cone(String name){
        this.name=name;
        base=new Point3D();
        tip=new Point3D();
        radius=5;
        initialised=true;
    }

    public Cone(Point3D base, Point3D tip, int radius) {
        if (base.getX() > 0 && base.getZ() >= 0 && base.getY() > 0 && tip.getZ() > 0 && tip.getX() >= 0 && tip.getY() >= 0 && radius > 0) {
            name = "Cone";
            this.base = base;
            this.tip = tip;
            this.radius = radius;
            initialised = true;
        }
    }
    public Cone(Point3D base, Point3D tip, int radius,String name) {
        if (base.getX() > 0 && base.getZ() >= 0 && base.getY() > 0 && tip.getZ() > 0 && tip.getX() >= 0 && tip.getY() >= 0 && radius > 0) {
            this.name = name;
            this.base = base;
            this.tip = tip;
            this.radius = radius;
            initialised = true;
        }
    }

    public void setBase(Point3D base){
        if(initialised && base.getX() > 0 && base.getZ() >= 0 && base.getY() > 0 )
    this.base=base;
    }

    public void setTip(Point3D tip){
        if(initialised && tip.getZ() > 0 && tip.getX() >= 0 && tip.getY() >= 0)
            this.tip=tip;
    }
    public void setRadius(int radius){
        if(initialised && radius >0)
            this.radius=radius;
    }
    public double getRadius(){
        if(initialised)
            return radius;
        return -1;
    }
    public Point3D getBase(){
        if(initialised)
            return base;
        else
            return new Point3D();
    }
    public double getHeight(){
        if(initialised)
            return tip.getZ()-base.getZ();
        return -1;
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
        if(initialised)
            return name+":["+base.getX()+","+base.getY()+","+base.getZ()+") "+"("+tip.getX()+","+tip.getY()+","+tip.getZ()+")" +radius+"]";
        else
            return "Cone not initialised";
    }
}
