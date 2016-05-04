package shapes.shapes3D.round3D;

import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Exceptions.NullObject;
import shapes.Shape;
import shapes.shapes3D.base.Point3D;
import shapes.visitorPattern.DrawingPartsVisitor;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cylinder extends Round3D{
    private Point3D end;

    public Cylinder(){
        try {
            start = new Point3D(0, 5, 5);
            end = new Point3D(5, 5, 5);
        } catch(Invalid3DCoordinates e){}
        radius=5;
        initialised=true;
        name="Cylinder";
    }
    public Cylinder(String name){
        this.name=name;
        try {
            start = new Point3D(0, 5, 5);
            end = new Point3D(5, 5, 5);
        } catch(Invalid3DCoordinates e){}
        radius=5;
        initialised=true;
    }

    public Cylinder(Point3D start,Point3D end) {
            this.start = start;
            this.end = end;
            initialised = true;
            name = "Cylinder";
    }

    public Cylinder(Point3D start,Point3D end,String name) {
        this.name = name;
            this.start = start;
            this.end = end;
            initialised = true;
    }
    public void accept(DrawingPartsVisitor drawingPartsVisitor){
        drawingPartsVisitor.visit(this);
    }

    public Point3D getEnd(){
        return end;
    }

    public void setEnd(Point3D end) throws NullObject{
        if(this.equals(null))
            throw new NullObject();
            this.end=end;
    }

    public double getHeight(){
        return Math.abs(end.getZ()-start.getZ());
    }
    public void draw(){
        System.out.println("Drawing "+name+" with a length of "+radius+" and the starting point at "+start);
        if (getSubShapes().size() > 0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }
    }

    public String toString(){
            return name+":[("+start.getX()+","+start.getY()+","+start.getZ()+"),("+
                    +end.getX()+","+end.getY()+","+end.getZ()+") "+radius+"]";
    }

}
