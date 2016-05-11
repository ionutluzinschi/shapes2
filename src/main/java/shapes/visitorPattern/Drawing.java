package shapes.visitorPattern;

import shapes.Shape;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class Drawing extends Shape {
    Shape[] parts;
    Shape drawing;
    public Drawing(Shape shape){
        drawing=shape;
    }


    public void accept (Visitor partVisitor){
        partVisitor.visit(drawing);
        for(Shape sh:drawing.getSubShapes())
          sh.accept(partVisitor);
    }

    public void draw(){}
    public String toString(){
        return "in drawing";
    }

}
