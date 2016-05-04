package shapes.visitorPattern;

import shapes.Shape;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.triangle.Triangle;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class Drawing extends Shape {
    Shape[] parts;
    public Drawing(){
        parts=new Shape[]{new Square(),new Circle(),new Triangle()};
    }
    @Override
    public void accept(DrawingPartsVisitor drawingPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(drawingPartVisitor);
        }
        drawingPartVisitor.visit(this);
    }
    public void draw(){}
}
