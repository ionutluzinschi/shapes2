package shapes.shapes2D.rectangle;

import shapes.Shape;
import shapes.shapes2D.Shapes2D;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Rectangle extends Rectangular{


    private Point lowerRight;
    private double width;

    public Rectangle(){
        name="Rectangle";
        upperLeft= new Point(0,0);
        lowerRight=new Point(5,5);
        initialised=true;
        calculateLength();
        calculateWidth();
    }

    public Rectangle(String name){
        this.name=name;
        upperLeft= new Point(0,0);
        lowerRight=new Point(5,5);
        initialised=true;
        calculateLength();
        calculateWidth();
    }

    public Rectangle(double length,double width){
        if(length>0 && width >0) {
            name="Rectangle";
            upperLeft=new Point(0,0);
            lowerRight =new Point(length, width);
            initialised=true;
           calculateLength();
           calculateWidth();
        }
    }
    public Rectangle(Point x, Point y){
        if(x.getX()>0 && x.getY()>0 && y.getX()>0 && y.getY()>0)
        {
            name="Rectangle";
            upperLeft=x;
            lowerRight=y;
            initialised=true;
           calculateLength();
            calculateWidth();
        }
    }
    public Rectangle(Point x, Point y,String name){
        if(x.getX()>0 && x.getY()>0 && y.getX()>0 && y.getY()>0)
        {
            this.name=name;
            upperLeft=x;
            lowerRight=y;
            initialised=true;
            calculateLength();
            calculateWidth();
        }
    }

    public Rectangle(double length, double width,String name ){

        if(length>0 && width >0) {
            this.name=name;
            upperLeft=new Point(0,0);
            lowerRight=new Point(length, width);
            initialised=true;
            calculateLength();
            calculateWidth();
        }
    }


    public void setCoordinates(double length, double width){
        if(initialised){
        if(length>0 && width >0) {
            lowerRight.setCoordinates(length+upperLeft.getX(), width+upperLeft.getY());
            calculateLength();
            calculateWidth();

        }
    }
    }
    public void setCoordinates(Point x, Point y){
        if(initialised) {
            if (x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
                upperLeft = x;
                lowerRight = y;
                calculateLength();
                calculateWidth();
            }
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
        if(initialised){
          return width;
        }
        else
            return 0;
    }

    public String toString(){
        if(this.initialised)
            return name+":[("+upperLeft.getX()+","+upperLeft.getY()+"),("+lowerRight.getX()+"),("+lowerRight.getY()+")]";

        else
             return "Rectangle not initialised";

    }

}
