package shapes.shapes2D.rectangle;

import shapes.shapes2D.Shape;
import shapes.shapes2D.base.Line;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Rectangle implements Shape{

    private Point upperLeft;
    private Point lowerRight;
    private boolean initialised=false;

    public Rectangle(){
        upperLeft= new Point(0,0);
        lowerRight=new Point(5,5);
        initialised=true;
    }


    public Rectangle(Point x, Point y){
        if(x.getX()>0 && x.getY()>0 && y.getX()>0 && y.getY()>0)
        {

            upperLeft=x;
            lowerRight=y;
            initialised=true;
        }
    }
    public Rectangle(double length, double width ){

        if(length>0 && width >0) {
            lowerRight.setCoordinates(length, width);
            initialised=true;
        }
    }

    public Rectangle(double x, double y, double z, double w){
        if(x>=0 && y>=0 ) {
            upperLeft.setCoordinates(x, y);
            if (z > 0 && z != upperLeft.getX() && w != upperLeft.getY() && w > 0) {
                lowerRight.setCoordinates(z, w);
                initialised=true;
            }
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

    public void setCoordinates(double x, double y, double z, double w) {
        if(initialised){
        if (x >= 0 && y >= 0) {
            upperLeft.setCoordinates(x, y);
            if (z > 0 && z != upperLeft.getX() && w != upperLeft.getY() && w > 0) {
                lowerRight.setCoordinates(z, w);

            }
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


    public boolean getState(){
        return initialised;
    }
    public void draw(){
        //
    }

    public String toString(){
        if(initialised)
            return ("Rectangle has coordinates [("+upperLeft.getX()+","+upperLeft.getY()+") , ("+lowerRight.getX()+"),("+lowerRight.getY()+")]");

        else
             return "Rectangle not initialised";

    }

}
