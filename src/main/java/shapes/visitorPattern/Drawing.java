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
        parts=shape.getSubShapes().toArray(new Shape[shape.getSubShapes().size()]);
    }


    public void accept (Visitor jsonPartVisitor){
        jsonPartVisitor.visit(drawing);
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(jsonPartVisitor);
        }
    }

    public void draw(){}


}
