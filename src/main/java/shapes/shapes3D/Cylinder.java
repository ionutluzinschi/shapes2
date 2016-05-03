package shapes.shapes3D;

import shapes.Shape;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cylinder extends Shape{
    private Point3D start;
    private Point3D end;
    private double radius;

    public Cylinder(){
        start=new Point3D();
        end=new Point3D();
        radius=5;
        initialised=true;
        name="Cylinder";
    }
    public Cylinder(String name){
        this.name=name;
        start=new Point3D();
        end=new Point3D();
        radius=5;
        initialised=true;
    }

    public Cylinder(Point3D start,Point3D end) {
        if (start.getX() >= 0 && start.getY() >= 0 && start.getZ() >= 0 && end.getX() > 0 && end.getZ() > 0 && end.getZ() > 0) {
            this.start = start;
            this.end = end;
            initialised = true;
            name = "Cylinder";
        }
    }

    public Cylinder(Point3D start,Point3D end,String name) {
        if (start.getX() >= 0 && start.getY() >= 0 && start.getZ() >= 0 && end.getX() > 0 && end.getZ() > 0 && end.getZ() > 0) {
            this.name = name;
            this.start = start;
            this.end = end;
            initialised = true;
        }
    }
    public void setStart(Point3D start){
        if(initialised && start.getX()>=0 && start.getZ()>=0 && start.getY()>=0)
            this.start=start;
    }
    public void setEnd(Point3D end){
        if(initialised && end.getX()>0 && end.getY()>0 && end.getZ()>0)
            this.end=end;
    }
    public Point3D getStart(){
        return start;
    }
    public Point3D getEnd(){
        return end;
    }

    public double getHeight(){
        if(initialised)
            return end.getZ()-start.getZ();
        return -1;
    }
    @Override
    public void draw(){        //
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public String toString(){
        if(initialised)
            return name+":[("+start.getX()+","+start.getY()+","+start.getZ()+"),("+
                    +end.getX()+","+end.getY()+","+end.getZ()+") "+radius+"]";
        else
            return "Cylinder not initialised";
    }

}
