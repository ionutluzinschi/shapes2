package shapes.shapes3D;

import shapes.shapes2D.round.Circle;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Sphere {
    private Point3D center;
    private double radius;
    private boolean initialised=false;

    public Sphere(){
        center=new Point3D();
        radius=0;
        initialised=true;
    }
    public Sphere(Point3D x, double radius){
        if(x.getX()>radius && x.getY()>radius && x.getZ()>radius) {
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
    public void setRadius(double radius){
        if(initialised && center.getX()>radius && center.getY()>radius && center.getZ()>radius) {
            this.radius=radius;
        }
    }

    public void draw(){
        //
    }
    public String toString(){
        if(initialised)
            return "Sphere is at coordinates ("+center.getX()+","+center.getY()+","+center.getZ()+") and has a radius of"+radius;
        else
            return "Sphere not initialised";
    }

}
