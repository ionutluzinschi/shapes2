package shapes;

import shapes.visitorPattern.DrawingPartsVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790148 on 4/26/2016.
 */
public abstract class Shape {


    protected String name;
    protected boolean initialised=false;
    List<Shape> subShapes=new ArrayList<Shape>();

    public boolean getState(){
        return initialised;
    }
    public String toString(){
        return this.toString();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
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

    public abstract void accept(DrawingPartsVisitor drawingPartVisitor);

    public abstract void draw();
}
