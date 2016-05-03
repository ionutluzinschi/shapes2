package shapes;

import shapes.shape2DFactory.Shape2DFactory;

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
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
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
        System.out.println(this);
        for(Shape sh:getSubShapes()) {
            sh.draw();
        }
    }
}
