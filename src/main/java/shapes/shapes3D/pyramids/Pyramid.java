package shapes.shapes3D.pyramids;

import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Exceptions.InvalidValue;
import shapes.Exceptions.NullObject;
import shapes.Shape;
import shapes.shapes3D.base.Point3D;
import shapes.visitorPattern.DrawingPartsVisitor;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Pyramid extends Pyramids {
    private double width;

    public Pyramid(){
        length=5;
        width=5;
        initialised=true;
        name="Pyramid";
        try{
            base=new Point3D(5,5,0);
            tip=new Point3D(5,5,5);}
        catch(Invalid3DCoordinates e) {}

    }
    public Pyramid(String name){
        this.name=name;
        length=5;
        width=5;
        initialised=true;
        try{
            base=new Point3D(5,5,0);
            tip=new Point3D(5,5,5);}
        catch(Invalid3DCoordinates e) {}
    }
    public Pyramid(Point3D tip,Point3D base, double length,double width) throws InvalidValue{
      if(length<0)
          throw new InvalidValue(length);
      if(width<0)
          throw new InvalidValue(width);
        this.tip=tip;
        this.base=base;
        this.length = length;
        this.width = width;
        initialised = true;
        name="Pyramid";

    }

    public Pyramid(Point3D tip,Point3D base, double length,double width,String name) throws InvalidValue{
        if(length<0)
            throw new InvalidValue(length);
        if(width<0)
            throw new InvalidValue(width);
            this.tip=tip;
            this.base=base;
            this.name=name;
            this.length = length;
            this.width = width;
            initialised = true;
    }
    public void accept(DrawingPartsVisitor drawingPartsVisitor){
        drawingPartsVisitor.visit(this);
    }

    public double getWidth() throws NullObject{
        if(this.equals(null))
            throw new NullObject();
        return width;
    }

    public void setWidth(double width) throws InvalidValue,NullObject{
        if(this.equals(null))
            throw new NullObject();
        if(width<0)
            throw new InvalidValue(width);
            this.width=width;
    }

    public void draw(){
        System.out.println("Drawing "+name+" with length of "+length+" and width of "+width+" and tip at "+tip);
        if (getSubShapes().size() > 0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }
    }

    public String toString(){
            return name+":["+tip+" "+length+" "+width+"]";

    }
}
