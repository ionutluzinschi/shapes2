package shapes.shapes3D.cuboids;

import shapes.Exceptions.InvalidValue;
import shapes.Shape;
import shapes.shapes3D.base.Point3D;
import shapes.visitorPattern.Visitor;


/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cube extends Cuboids {


    public Cube(){
        name="Cube";
        upperLeft=new Point3D();
        length=5;
    }
    public Cube(String name){
        this.name=name;
        upperLeft=new Point3D();
        length=5;
    }

    public Cube(Point3D x,double length) throws InvalidValue {
       if(length<0)
           throw new InvalidValue(length);
        upperLeft = x;
        name = "Cube";
        this.length = length;
    }

    public Cube(Point3D x,double length,String name) throws InvalidValue {
        if(length<0)
            throw new InvalidValue(length);
            this.name = name;
            upperLeft = x;
            this.length = length;
    }


    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }
    public void draw(){
        System.out.println("Drawing "+name+" with a length of "+length);
        if (getSubShapes().size() > 0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }
    }

    public String toString(){
            return name+":["+upperLeft+" "+length+"]";

    }

}
