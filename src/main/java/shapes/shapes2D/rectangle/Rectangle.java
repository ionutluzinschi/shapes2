package shapes.shapes2D.rectangle;

import shapes.Shape;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Rectangle extends Shape{


    private Point upperLeft;
    private Point lowerRight;
    private double length;
    private double width;

    public Rectangle(){
        name="Rectangle";
        upperLeft= new Point(0,0);
        lowerRight=new Point(5,5);
        initialised=true;
    }

    public Rectangle(String name){
        this.name=name;
        upperLeft= new Point(0,0);
        lowerRight=new Point(5,5);
        initialised=true;
    }

    public Rectangle(double length,double width){
        if(length>0 && width >0) {
            name="Rectangle";
            upperLeft=new Point(0,0);
            lowerRight =new Point(length, width);
            initialised=true;
        }
    }
    public Rectangle(Point x, Point y){
        if(x.getX()>0 && x.getY()>0 && y.getX()>0 && y.getY()>0)
        {
            name="Rectangle";
            upperLeft=x;
            lowerRight=y;
            initialised=true;
        }
    }
    public Rectangle(Point x, Point y,String name){
        if(x.getX()>0 && x.getY()>0 && y.getX()>0 && y.getY()>0)
        {
            this.name=name;
            upperLeft=x;
            lowerRight=y;
            initialised=true;
        }
    }

    public Rectangle(double length, double width,String name ){

        if(length>0 && width >0) {
            this.name=name;
            upperLeft=new Point(0,0);
            lowerRight=new Point(length, width);
            initialised=true;
        }
    }


    public void setCoordinates(double length, double width){
        if(initialised){
        if(length>0 && width >0) {
            lowerRight.setCoordinates(length, width);

        }
    }
    }
    public void setCoordinates(Point x, Point y){
        if(initialised) {
            if (x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
                upperLeft = x;
                lowerRight = y;
            }
        }
    }


    public double getLength(){
        if(initialised){
            if(Math.abs(lowerRight.getX()-upperLeft.getX())>Math.abs(lowerRight.getY()-upperLeft.getY()))
                return Math.abs(lowerRight.getX()-upperLeft.getX());
            else
                return Math.abs(lowerRight.getY()-upperLeft.getY());
        }
        else
            return 0;

    }

    public double getWidth(){
        if(initialised){
            if(Math.abs(lowerRight.getX()-upperLeft.getX())<Math.abs(lowerRight.getY()-upperLeft.getY()))
                return Math.abs(lowerRight.getX()-upperLeft.getX());
            else
                return Math.abs(lowerRight.getY()-upperLeft.getY());
        }
        else
            return 0;
    }


    @Override
    public void draw(){
        System.out.println("Rectangle: length= "+this.getLength()+", width= "+this.getWidth());
    }

    @Override
    public String toString(){
        if(this.initialised)
            return name+":[("+upperLeft.getX()+","+upperLeft.getY()+"),("+lowerRight.getX()+"),("+lowerRight.getY()+")]";

        else
             return "Rectangle not initialised";

    }

}
