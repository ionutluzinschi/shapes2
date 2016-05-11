package shapes.shapes3D.round3D;

import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Exceptions.InvalidRadius;
import shapes.Exceptions.OutOfBounds;
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
        name="Sphere";
    }

    public Sphere(Point3D x, double radius) throws InvalidRadius{
        if(radius<=0 || radius >x.getX() || radius> x.getZ()||radius>x.getY())
            throw new InvalidRadius(radius);
            start = x;
            this.radius = radius;
            name="Sphere";
        }

    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }

    public void setRadius(double radius) throws InvalidRadius, OutOfBounds{
        if(radius<=0 )
            throw new InvalidRadius(radius);
        if(radius >start.getX() || radius> start.getZ()||radius>start.getY())
            throw new OutOfBounds(radius,start);
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
