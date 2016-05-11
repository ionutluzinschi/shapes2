package shapes.shapes3D.round3D;

import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Exceptions.InvalidRadius;
import shapes.Shape;
import shapes.shapes3D.base.Point3D;
import shapes.visitorPattern.Visitor;


/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cone extends Round3D {
    private Point3D tip;

    public Cone() throws Invalid3DCoordinates{
        start = new Point3D(5, 5, 5);
        tip = new Point3D(5, 5, 0);
        radius=5;
        name="Cone";
    }
    public Cone(Point3D start, Point3D tip, int radius) throws InvalidRadius {
       if(radius<0)
           throw new InvalidRadius(radius);
        name = "Cone";
        this.start = start;
        this.tip = tip;
        this.radius = radius;
        }

    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }

    public void setRadius(int radius)throws InvalidRadius {
        if(radius<0)
            throw new InvalidRadius(radius);
            this.radius=radius;
    }

    public double getHeight(){
        return tip.getZ()-start.getZ();
    }

    public Point3D getTip(){
        return tip;
    }

    public void setTip(Point3D tip){
          this.tip=tip;
    }

    public void draw(){
        System.out.println("Drawing "+name+" with the base at "+start+" a radius of "+radius+" and the tip at "+tip);
        if (getSubShapes().size() > 0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }
    }

    public String toString(){
        return name+":["+start.getX()+","+start.getY()+","+start.getZ()+") "+"("+tip.getX()+","+tip.getY()+","+tip.getZ()+")" +radius+"]";
    }
}
