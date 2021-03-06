package shapes.shapes2D.rectangle;

import java.util.ArrayList;
import java.util.List;

import shapes.Exceptions.InvalidCoordinates;
import shapes.Shape;
import shapes.shapes2D.Shapes2D;
import shapes.shapes2D.base.Point;
import shapes.visitorPattern.Visitor;


/**
 * Created by V3790148 on 4/26/2016.
 */
public class Polygon extends Shapes2D {


    List<Point> list= new ArrayList<Point>();

    public Polygon(){
        name="Polygon";
        try {
            list.add(new Point(0, 0));
            list.add(new Point(2, 2));
            list.add(new Point(3, 7));
        } catch(InvalidCoordinates e) {}

    }

    public Polygon(Point... points){
        for(Point x:points)
        {
            if(x.getX()>=0 && x.getY()>=0)
                list.add(x);
        }
        name="Polygon";

    }
    public List getPoints(){
        return list;
    }

    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }


    public void draw(){
        System.out.println("Drawing "+name+" with coordinates at "+list);
        if(getSubShapes().size()>0) {
            System.out.println("Drawing subshapes of "+name+": ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }
    }



    public String toString(){
        return name+":"+list.toString();
    }

}
