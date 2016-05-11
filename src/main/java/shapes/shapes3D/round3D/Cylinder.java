package shapes.shapes3D.round3D;

import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Shape;
import shapes.shapes3D.base.Point3D;
import shapes.visitorPattern.Visitor;


/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cylinder extends Round3D{
    private Point3D end;

    public Cylinder() throws Invalid3DCoordinates{
        start = new Point3D(0, 5, 5);
        end = new Point3D(5, 5, 5);
        radius=5;
        name="Cylinder";
    }

    public Cylinder(Point3D start,Point3D end) {
            this.start = start;
            this.end = end;
            name = "Cylinder";
    }

    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }

    public Point3D getEnd(){
        return end;
    }

    public void setEnd(Point3D end) { this.end=end;  }

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
