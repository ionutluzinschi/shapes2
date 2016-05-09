package shapes.shapes3D.pyramids;

import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Exceptions.InvalidValue;
import shapes.Shape;
import shapes.shapes3D.base.Point3D;
import shapes.visitorPattern.Visitor;


/**
 * Created by V3790148 on 4/27/2016.
 */
public class SquarePyramid extends Pyramids {

    public SquarePyramid(){
        length=3;
        name="Square Pyramid";

        try{
        tip=new Point3D(2,2,4);
        base=new Point3D(5,5,0);}
        catch(Invalid3DCoordinates e){}
        initialised=true;
    }
    public SquarePyramid(String name) {
        this.name=name;
        length=3;
        try{
            tip=new Point3D(2,2,4);
            base=new Point3D(5,5,0);}
        catch(Invalid3DCoordinates e){}
        initialised=true;
    }

    public SquarePyramid(Point3D tip,Point3D base,double length) throws InvalidValue {
        if (length <= 0)
            throw new InvalidValue(length);
        name = "Square Pyramid";
        this.tip = tip;
        this.base = base;
        this.length = length;
        initialised = true;
    }

    public SquarePyramid(Point3D tip,Point3D base,double length, String name) throws InvalidValue{
        if (length <= 0)
            throw new InvalidValue(length);
            this.name = name;
            this.tip=tip;
            this.base=base;
            this.length = length;
            initialised = true;
    }

    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }
    public void draw(){
        System.out.println("Drawing "+name+" with a length of "+length+" and the tip at "+tip);
        if (getSubShapes().size() > 0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }
    }

    public String toString(){
        return name+":["+tip+" "+length+"]";
    }


}
