package shapes.shapes2D.round;
import shapes.Exceptions.*;
import shapes.Exceptions.OutOfBounds;
import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.visitorPattern.Visitor;


/**
 * Created by V3790148 on 4/26/2016.
 */
public class Circle extends Round {

    public Circle() {
        try{
        center = new Point(50, 50);}
        catch (InvalidCoordinates e) {}

        radius = 3 * Math.PI;
        initialised = true;
        name="Circle";
    }
    public Circle(String name) {
        this.name=name;
        try {
            center = new Point(50, 50);
        } catch(InvalidCoordinates e){}
        radius = 3 * Math.PI;
        initialised = true;
    }

    public Circle(Point x, double z) throws InvalidRadius,OutOfBounds {
        if (z < 0)
            throw new InvalidRadius(z);

        if (z > x.getX() && z > x.getY())
            throw new OutOfBounds(z, x,x);
        center = x;
        radius = z;
        initialised = true;
        name = "Circle";

    }

    public Circle(Point x, double z,String name) throws InvalidRadius,OutOfBounds {
        if(z<0)
            throw new InvalidRadius(z);
        if (z > x.getX() && z > x.getY())
            throw new OutOfBounds(z,x,x);
        this.name=name;
        center = x;
        radius = z;
        initialised = true;
        }

    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }
    public void draw() {
        System.out.println("Drawing "+name+" with center at "+center);
            if(getSubShapes().size()>0) {
                System.out.println("Drawing subshapes: ");
                for (Shape sh : getSubShapes()) {
                    sh.draw();
                }
                System.out.println("Finished drawing subshapes for "+name);
            }
    }

    public String toString(){
        return name+":[("+center.getX()+","+center.getY()+"),"+radius+"]";

    }


}
