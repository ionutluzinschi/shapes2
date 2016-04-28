package shapes.shapes2D.round;

import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Elipse {

    private Point focA;
    private Point focB;
    private double length;
    private boolean initialised=false;

    public Elipse(){
        focA=new Point();
        focB=new Point();
        length=5;
        initialised=true;
    }

    public Elipse(Point x,Point y, double length){
        focA=x;
        focB=y;
        if(length>0)
            this.length=length;
        else
            this.length=5;
    initialised=true;
    }

    public void setFoci(Point x, Point y){
        if(initialised){
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

    public boolean getState(){
        return initialised;
    }

    public void draw(){

    }
    public String toString(){
        if(initialised)
            return "Elipse has foci at "+focA+" and "+focB+" and has a length of "+length;
        else
            return "Elipse not initialised";

    }

}
