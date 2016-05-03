package shapes.shapes3D.round3D;

import shapes.Shape;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Sphere extends Round3D {

    public Sphere(){
        start=new Point3D();
        radius=0;
        initialised=true;
        name="Sphere";
    }

    public Sphere(String name){
        this.name=name;
        start=new Point3D();
        radius=0;
        initialised=true;
    }

    public Sphere(Point3D x, double radius){
        if(x.getX()>radius && x.getY()>radius && x.getZ()>radius) {
            start = x;
            this.radius = radius;
            initialised = true;
            name="Sphere";
        }
    }
    public Sphere(Point3D x, double radius,String name){
        if(x.getX()>radius && x.getY()>radius && x.getZ()>radius) {
            this.name=name;
            start = x;
            this.radius = radius;
            initialised = true;
        }
    }

    public void setRadius(double radius){
        if(initialised && start.getX()>radius && start.getY()>radius && start.getZ()>radius) {
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
            return name+":[("+start.getX()+","+start.getY()+","+start.getZ()+") "+radius+"]";
        else
            return "Sphere not initialised";
    }

}
