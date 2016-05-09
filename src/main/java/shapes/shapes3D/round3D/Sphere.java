package shapes.shapes3D.round3D;

import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Exceptions.InvalidRadius;
import shapes.Exceptions.NullObject;
import shapes.Shape;
import shapes.shapes3D.base.Point3D;
import shapes.visitorPattern.Visitor;


/**
 * Created by V3790148 on 4/27/2016.
 */
public class Sphere extends Round3D {

    public Sphere(){
        try {
            start = new Point3D(5, 5, 5);
        }
        catch(Invalid3DCoordinates e){}
        radius=0;
        initialised=true;
        name="Sphere";
    }

    public Sphere(String name){
        this.name=name;
        try {
            start = new Point3D(5, 5, 5);
        }
        catch(Invalid3DCoordinates e){}
        radius=0;
        initialised=true;
    }

    public Sphere(Point3D x, double radius) throws InvalidRadius{
        if(radius<=0 || radius >x.getX() || radius> x.getZ()||radius>x.getY())
            throw new InvalidRadius(radius);
            start = x;
            this.radius = radius;
            initialised = true;
            name="Sphere";
        }

    public Sphere(Point3D x, double radius,String name) throws InvalidRadius{
        if(radius<=0 || radius >x.getX() || radius> x.getZ()||radius>x.getY())
            throw new InvalidRadius(radius);
            this.name=name;
            start = x;
            this.radius = radius;
            initialised = true;

    }
    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }

    public void setRadius(double radius) throws NullObject,InvalidRadius{
        if(this.equals(null))
            throw new NullObject();
        if(radius<=0 || radius >start.getX() || radius> start.getZ()||radius>start.getY())
            throw new InvalidRadius(radius);
        this.radius=radius;
        }


    public void draw(){
        System.out.println("Drawing "+name+" with the center at "+start+" and radius of "+radius);
        if (getSubShapes().size() > 0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }
    }

    public String toString(){
                return name+":[("+start.getX()+","+start.getY()+","+start.getZ()+") "+radius+"]";
    }

}
