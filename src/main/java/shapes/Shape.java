package shapes;

import shapes.shape2DFactory.Shape2DFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Shape {
    protected String name="shape";
    private Shape myShape;
    protected boolean initialised=false;
    List<Shape> shapes;

    public Shape(){
        name="default";
        initialised=false;
    }
    public Shape(Shape shape){
        name=shape.getName();
        myShape=shape;
        shapes=new ArrayList<Shape>();
    }
    public double getArea(){
        if(initialised)
        return AreaCalculator.calculateArea(this);
        else
            return -1;
    }
    public void addSubShape(Shape sh){
        shapes.add(sh);
    }
    public void removeSubShape(Shape sh){
        shapes.remove(sh);
    }
    public List<Shape> getSubShapes(){
        return shapes;
    }

    public void draw(){
        System.out.println(this.toString());
        for(Shape sh: this.getSubShapes()){
            sh.draw();

        }
        System.out.println("");
    }
     public boolean getState(){
         return initialised;
     }
     public String toString(){
         return myShape.toString();
     }

     public void setName(String name)
     {  if(initialised)
             this.name=name;
     }

     public String getName(){
         return name;
     }

}
