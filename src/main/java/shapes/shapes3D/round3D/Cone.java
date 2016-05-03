package shapes.shapes3D.round3D;

import shapes.Shape;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cone extends Round3D {
    private Point3D tip;



    public Cone(){
        start=new Point3D();
        tip=new Point3D();
        radius=5;
        initialised=true;
        name="Cone";
    }
    public Cone(String name){
        this.name=name;
        start=new Point3D();
        tip=new Point3D();
        radius=5;
        initialised=true;
    }

    public Cone(Point3D start, Point3D tip, int radius) {
        if (start.getX() > 0 && start.getZ() >= 0 && start.getY() > 0 && tip.getZ() > 0 && tip.getX() >= 0 && tip.getY() >= 0 && radius > 0) {
            name = "Cone";
            this.start = start;
            this.tip = tip;
            this.radius = radius;
            initialised = true;
        }
    }
    public Cone(Point3D start, Point3D tip, int radius,String name) {
        if (start.getX() > 0 && start.getZ() >= 0 && start.getY() > 0 && tip.getZ() > 0 && tip.getX() >= 0 && tip.getY() >= 0 && radius > 0) {
            this.name = name;
            this.start = start;
            this.tip = tip;
            this.radius = radius;
            initialised = true;
        }
    }


    public void setTip(Point3D tip){
        if(initialised && tip.getZ() > 0 && tip.getX() >= 0 && tip.getY() >= 0)
            this.tip=tip;
    }
    public void setRadius(int radius){
        if(initialised && radius >0)
            this.radius=radius;
    }

    public double getHeight(){
        return tip.getZ()-start.getZ();
    }
    public Point3D getTip(){
        return tip;
    }

    public String toString(){
        if(initialised)
            return name+":["+start.getX()+","+start.getY()+","+start.getZ()+") "+"("+tip.getX()+","+tip.getY()+","+tip.getZ()+")" +radius+"]";
        else
            return "Cone not initialised";
    }
}
