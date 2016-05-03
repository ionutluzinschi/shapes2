package shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790148 on 5/3/2016.
 */
public class Composite extends Shape {
    Shape myShape;
    List<Shape> subShapes;

    public Composite(Shape shape){
        myShape=shape;
        subShapes=new ArrayList<Shape>();
    }

    public void addSubShape(Shape sh){
        subShapes.add(sh);
    }
    public void removeSubShape(Shape sh){
        subShapes.remove(sh);
    }
    public List<Shape> getSubShapes(){
        return subShapes;
    }

    public void draw(){
        System.out.println(myShape);
        for(Shape sh:getSubShapes()) {
            sh.draw();

        }
    }

}
