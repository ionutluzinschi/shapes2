package shapes.visitorPattern;

import shapes.Shape;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.triangle.Triangle;

import java.util.List;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class Drawing extends Shape {
    Shape[] parts;
    public Drawing(Shape shape){
        parts=shape.getSubShapes().toArray(new Shape[shape.getSubShapes().size()]);
    }
    @Override
    public void accept(DrawingPartsVisitor drawingPartVisitor) {
        drawingPartVisitor.visit(this);
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(drawingPartVisitor);
        }
    }
    public void draw(){}


}
