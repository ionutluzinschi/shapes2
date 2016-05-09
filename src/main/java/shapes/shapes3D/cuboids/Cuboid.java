package shapes.shapes3D.cuboids;

import shapes.Exceptions.InvalidValue;
import shapes.Shape;
import shapes.shapes3D.base.Point3D;
import shapes.visitorPattern.Visitor;


/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cuboid extends Cuboids {

    private double width;
    private double height;

    public Cuboid(){
        upperLeft=new Point3D();
        length=5;
        width=5;
        height=5;
        initialised=true;
        name="Cuboid";
    }
    public Cuboid(String name){
        this.name=name;
        upperLeft=new Point3D();
        length=5;
        width=5;
        height=5;
        initialised=true;
    }

    public Cuboid(Point3D upperLeft, double length, double width,double height) throws InvalidValue{
        if(width<=0)
          throw new InvalidValue(width);
        if(length<=0)
            throw new InvalidValue(length);
        if(height<=0)
            throw new InvalidValue(height);
        name = "Cuboid";
        this.upperLeft = upperLeft;
        this.length = length;
        this.width = width;
        this.height = height;
        initialised = true;
    }

    public Cuboid(Point3D upperLeft, double length, double width,double height,String name) throws InvalidValue {
        if(width<=0)
            throw new InvalidValue(width);
        if(length<=0)
            throw new InvalidValue(length);
        if(height<=0)
            throw new InvalidValue(height);
        this.name = name;
        this.upperLeft = upperLeft;
        this.length = length;
        this.width = width;
        this.height = height;
        initialised = true;

    }
    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws InvalidValue{
        if(width<=0)
            throw new InvalidValue(width);
            this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws InvalidValue{
        if(height<=0)
            throw new InvalidValue(height);
            this.height=height;
    }

    public void setLength(double length) throws  InvalidValue{
        if(length<=0)
            throw new InvalidValue(length);
            this.length=length;
    }

    public void draw(){
        System.out.println("Drawing "+name+" with length of "+length+" and width of "+width);
        if (getSubShapes().size() > 0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }

    }
    public String toString(){
            return name+"["+upperLeft+ " "+length+", "+height+" ,"+width+"]";

    }

}
