package shapes.shapes3D.round3D;

import shapes.Shape;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cylinder extends Round3D{
    private Point3D end;

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

    public void setEnd(Point3D end){
        if(initialised && end.getX()>0 && end.getY()>0 && end.getZ()>0)
            this.end=end;
    }

    public Point3D getEnd(){
        return end;
    }

    public double getHeight(){
        if(initialised)
            return end.getZ()-start.getZ();
        return -1;
    }

    public String toString(){
        if(initialised)
            return name+":[("+start.getX()+","+start.getY()+","+start.getZ()+"),("+
                    +end.getX()+","+end.getY()+","+end.getZ()+") "+radius+"]";
        else
            return "Cylinder not initialised";
    }

}
