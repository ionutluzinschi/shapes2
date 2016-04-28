package shapes.shapes3D;

import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cylinder{
    private Point3D start;
    private Point3D end;
    private double radius;

    //private double length;
    private boolean initialised=false;

    public Cylinder(){
        start=new Point3D();
        end=new Point3D();
        radius=5;
        initialised=true;
    }
    public Cylinder(Point3D start,Point3D end){
        this.start=start;
        this.end=end;
        initialised=true;
    }

    public void setStart(Point3D x){
        if(initialised)
            start=x;
    }
    public void setEnd(Point3D x){
        if(initialised)
            end=x;
    }
    public Point3D getStart(){
        return start;
    }
    public Point3D getEnd(){
        return end;
    }

    public void draw(){
        //
    }

    public boolean getState(){
        return initialised;
    }
    public String toString(){
        if(initialised)
            return "Cylinder starts at coordinates ("+start.getX()+","+start.getY()+","+start.getZ()+"),has a radius of"+
                    " ends at coordinates ("+end.getX()+","+end.getY()+","+end.getZ()+") and has a radius of"+radius;
        else
            return "Cylinder not initialised";
    }

}
