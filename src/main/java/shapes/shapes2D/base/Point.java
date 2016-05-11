package shapes.shapes2D.base;

import shapes.Exceptions.InvalidCoordinates;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Point implements Comparable<Point>{
    private double x=0;
    private double y=0;

    public Point(double x,double y) throws InvalidCoordinates {
        if (x < 0 || y < 0)
               throw new InvalidCoordinates(x, y);
           this.x = x;
           this.y = y;

    }
    public Point(){
        x=5;
        y=5;
    }

    public double getX(){
        return x;
    }

    public void setX(double x) throws InvalidCoordinates{
        if (x < 0)
                throw new InvalidCoordinates(x);
            this.x = x;

    }

    public double getY(){
        return y;
    }

    public void setY(double y) throws  InvalidCoordinates{
        if (y < 0)
                throw new InvalidCoordinates(y);
            this.y = y;


    }
    public void setCoordinates(double x,double y) throws  InvalidCoordinates{
        if (x < 0 || y < 0)
                throw new InvalidCoordinates(x, y);
            this.x = x;
            this.y = y;
    }


    public int compareTo(Point x){
        if(this.getX()==x.getX() && this.getY()==x.getY())
            return 0;
        else if(this.getX()>x.getX() || this.getY()>x.getY())
            return 1;
        else
            return -1;
    }

    public void draw(){
        //
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
