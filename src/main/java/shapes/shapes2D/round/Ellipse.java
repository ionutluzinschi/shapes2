package shapes.shapes2D.round;

import shapes.Shape;
import shapes.shapes2D.Shapes2D;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Ellipse extends Shapes2D{
    private Point focA;
    private Point focB;
    private double length;


    public Ellipse(){
        focA=new Point();
        focB=new Point();
        length=5;
        initialised=true;
        name="Ellipse";
    }
    public Ellipse(String name){
        this.name=name;
        focA=new Point();
        focB=new Point();
        length=5;
        initialised=true;
    }
    public Ellipse(Point x,Point y){
        if(x.getX()>0 && x.getY()>0 && y.getX()>0 &&y.getY()>0){
        focA=x;
        focB=y;
        length=Math.abs(focA.getY()-focB.getY())+1;
        name="Ellipse";
        }
    }

    public Ellipse(Point x,Point y, String name) {
        if (x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
            this.name = name;
            focA = x;
            focB = y;
            length = Math.abs(focA.getY() - focB.getY()) + 1;
        }
    }

    public Ellipse(Point x,Point y, double length) {
        if (x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
            name = "Ellipse";
            focA = x;
            focB = y;
            if (length > 0 && length > focA.getX() && length > focB.getX() && length > focA.getY() && length > focB.getY())
                this.length = length;
            else
                this.length = 10 + Math.max(Math.max(focA.getX(), focA.getY()), Math.max(focB.getX(), focB.getY()));
            initialised = true;
        }
    }
    public Ellipse(Point x,Point y, double length, String name) {
        if (x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
            this.name = name;
            focA = x;
            focB = y;
            if (length > 0)
                this.length = length;
            else
                this.length = 5;
            initialised = true;
        }
    }

    public void setFoci(Point x, Point y){
        if (initialised && x.getX() > 0 && x.getY() > 0 && y.getX() > 0 && y.getY() > 0) {
            focA=x;
            focB=y;
        }
    }

    public void setLength(double length){
        if(initialised && length>0){
            this.length=length;
        }
    }
    public double getLength(){
        return length;
    }
    public Point getFocA(){
        return focA;
    }
    public Point getFocB(){
        return focB;
    }

    @Override
    public void draw(){
        System.out.println("FocalA "+focA+" FocalB "+focB);

    }
    @Override
    public String toString(){
        if(initialised)
            return name+":[("+focA+","+focB+") " +length+"]";
        else
            return "Ellipse not initialised";

    }

}
