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
public class Cone extends Round3D {
    private Point3D tip;

    public Cone(){
        try {
            start = new Point3D(5, 5, 5);
            tip = new Point3D(5, 5, 0);
        }catch (Invalid3DCoordinates e){}
        radius=5;
        initialised=true;
        name="Cone";
    }
    public Cone(String name){
        this.name=name;
        try {
            start = new Point3D(5, 5, 5);
            tip = new Point3D(5, 5, 0);
        }catch (Invalid3DCoordinates e){}
        radius=5;
        initialised=true;
    }

    public Cone(Point3D start, Point3D tip, int radius) throws InvalidRadius {
       if(radius<0)
           throw new InvalidRadius(radius);
        name = "Cone";
        this.start = start;
        this.tip = tip;
        this.radius = radius;
        initialised = true;
        }

    public Cone(Point3D start, Point3D tip, int radius,String name)throws InvalidRadius {
        if(radius<0)
            throw new InvalidRadius(radius);
            this.name = name;
            this.start = start;
            this.tip = tip;
            this.radius = radius;
            initialised = true;
        }

    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }

    public void setRadius(int radius)throws NullObject,InvalidRadius {
        if(this.equals(null))
            throw new NullObject();
        if(radius<0)
            throw new InvalidRadius(radius);
            this.radius=radius;
    }

    public double getHeight(){
        return tip.getZ()-start.getZ();
    }

    public Point3D getTip(){
        return tip;
    }

    public void setTip(Point3D tip) throws NullObject{
        if(this.equals(null))
            throw new NullObject();
        this.tip=tip;
    }

    public void draw(){
        System.out.println("Drawing "+name+" with the base at "+start+" a radius of "+radius+" and the tip at "+tip);
        if (getSubShapes().size() > 0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }
    }

    public String toString(){

            return name+":["+start.getX()+","+start.getY()+","+start.getZ()+") "+"("+tip.getX()+","+tip.getY()+","+tip.getZ()+")" +radius+"]";
    }
}
