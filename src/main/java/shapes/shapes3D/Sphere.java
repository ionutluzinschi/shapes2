package shapes.shapes3D;

import shapes.Shape;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Sphere extends Shape {
    private Point3D center;
    private double radius;

    public Sphere(){
        center=new Point3D();
        radius=0;
        initialised=true;
        name="Sphere";
    }

    public Sphere(String name){
        this.name=name;
        center=new Point3D();
        radius=0;
        initialised=true;
    }

    public Sphere(Point3D x, double radius){
        if(x.getX()>radius && x.getY()>radius && x.getZ()>radius) {
            center = x;
            this.radius = radius;
            initialised = true;
            name="Sphere";
        }
    }
    public Sphere(Point3D x, double radius,String name){
        if(x.getX()>radius && x.getY()>radius && x.getZ()>radius) {
            this.name=name;
            center = x;
            this.radius = radius;
            initialised = true;
        }
    }

    public void setCenter(Point3D center){
        if(initialised && center.getX()>radius && center.getY()>radius && center.getZ()>radius)
         this.center=center;
    }
    public void setCenter(double x,double y,double z){
        if(initialised && x>radius && y>radius && z>radius)
        center=new Point3D(x,y,z);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(initialised && center.getX()>radius && center.getY()>radius && center.getZ()>radius) {
            this.radius=radius;
        }
    }
    @Override
    public void draw(){
        //
    }
    @Override
    public String toString(){
        if(initialised)
            return name+":[("+center.getX()+","+center.getY()+","+center.getZ()+") "+radius+"]";
        else
            return "Sphere not initialised";
    }

}
