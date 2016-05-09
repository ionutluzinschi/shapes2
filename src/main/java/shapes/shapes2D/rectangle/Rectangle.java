package shapes.shapes2D.rectangle;

import shapes.Exceptions.InvalidCoordinates;
import shapes.Exceptions.InvalidValue;
import shapes.Exceptions.NullObject;
import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.visitorPattern.Visitor;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Rectangle extends Rectangular{


    private Point lowerRight;
    private double width;

    public Rectangle(){
        name="Rectangle";
        try {
            upperLeft = new Point(0, 0);
            lowerRight = new Point(5, 5);
        } catch (InvalidCoordinates e) {}
        initialised=true;
        calculateLength();
        calculateWidth();
    }

    public Rectangle(String name){
        this.name=name;
        try {
            upperLeft = new Point(0, 0);
            lowerRight = new Point(5, 5);
        } catch(InvalidCoordinates e){}
        initialised=true;
        calculateLength();
        calculateWidth();
    }

    public Rectangle(double length,double width) throws InvalidValue{
        if(length<=0)
            throw new InvalidValue(length);
        if (width<=0)
            throw new InvalidValue(length);
            name="Rectangle";
        try {
            upperLeft = new Point(0, 0);
            lowerRight = new Point(length, width);
        }
            catch(InvalidCoordinates e){ }
           initialised=true;
           calculateLength();
           calculateWidth();

    }
    public Rectangle(Point x, Point y){
        name="Rectangle";
        upperLeft=x;
        lowerRight=y;
        initialised=true;
        calculateLength();
        calculateWidth();
    }
    public Rectangle(Point x, double y) throws InvalidValue{
        name="Rectangle";
        upperLeft=x;
        if(y<=0)
            throw new InvalidValue(y);
        try{lowerRight=new Point(x.getX()+y,x.getY()+y);}
        catch(InvalidCoordinates e){}
        initialised=true;
        calculateLength();
        calculateWidth();
    }

    public Rectangle(Point x, Point y,String name){
        this.name=name;
        upperLeft=x;
        lowerRight=y;
        initialised=true;
        calculateLength();
        calculateWidth();

    }

    public Rectangle(double length, double width,String name )throws InvalidValue{
        if(length<=0)
            throw new InvalidValue(length);
        if (width<=0)
            throw new InvalidValue(length);
        this.name=name;
        try {
            upperLeft = new Point(0, 0);
            lowerRight = new Point(length, width);
        }
        catch(InvalidCoordinates e){ }
        initialised=true;
        calculateLength();
        calculateWidth();
    }


    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }

    public void setCoordinates(double length, double width) throws NullObject,InvalidValue{
        if(this.equals(null))
            throw new NullObject();

        if(length<=0)
            throw new InvalidValue(length);
        if (width<=0)
            throw new InvalidValue(length);
            lowerRight.setCoordinates(length+upperLeft.getX(), width+upperLeft.getY());
            calculateLength();
            calculateWidth();
    }

    public void setCoordinates(Point x, Point y) throws NullObject{
        if(this.equals(null))
            throw new NullObject();
            if (x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
                upperLeft = x;
                lowerRight = y;
                calculateLength();
                calculateWidth();
            }

    }

    private void calculateLength(){
        if(Math.abs(lowerRight.getX()-upperLeft.getX())>Math.abs(lowerRight.getY()-upperLeft.getY()))
             length=Math.abs(lowerRight.getX()-upperLeft.getX());
        else
           length=Math.abs(lowerRight.getY()-upperLeft.getY());
    }


    private void calculateWidth(){
        if(Math.abs(lowerRight.getX()-upperLeft.getX())<Math.abs(lowerRight.getY()-upperLeft.getY()))
            width=Math.abs(lowerRight.getX()-upperLeft.getX());
        else
            width=Math.abs(lowerRight.getY()-upperLeft.getY());
    }
    public double getWidth(){
          return width;

    }

    public void draw(){
        System.out.println("Drawing "+name+" with length of "+length+" and a width of "+ width);
        if(getSubShapes().size()>0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }
    }

    public String toString(){
        return name+":[("+upperLeft.getX()+","+upperLeft.getY()+"),("+lowerRight.getX()+"),("+lowerRight.getY()+")]";

    }

}
