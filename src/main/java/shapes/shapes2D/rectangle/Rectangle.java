package shapes.shapes2D.rectangle;

import shapes.Exceptions.InvalidCoordinates;
import shapes.Exceptions.InvalidValue;
import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.visitorPattern.Visitor;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Rectangle extends Rectangular{


    private Point lowerRight;
    private double width;

    public Rectangle() throws InvalidCoordinates{
        name="Rectangle";
        upperLeft = new Point(0, 0);
        lowerRight = new Point(5, 5);

        calculateLength();
        calculateWidth();
    }

    public Rectangle(Point x,double length,double width) throws InvalidValue,InvalidCoordinates{
        if(length<=0)
            throw new InvalidValue(length);
        if (width<=0)
            throw new InvalidValue(length);
            name="Rectangle";
            upperLeft = x;
            lowerRight = new Point(x.getX()+length, x.getY()+width);
            calculateLength();
            calculateWidth();
    }

    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }

    public void setCoordinates(Point x, Point y){
                upperLeft = x;
                lowerRight = y;
                calculateLength();
                calculateWidth();
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
    public void setWidth(double width){
        this.width=width;
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
