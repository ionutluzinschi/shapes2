import org.junit.Test;
import shapes.Shape;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.triangle.Triangle;
import shapes.visitorPattern.Drawing;
import shapes.visitorPattern.simpleVisitorPattern.DrawingDisplayPartVisitor;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class VisitorPatternTest {
    @Test
    public void VisitorTest(){
        Shape square=new Square();
        square.addSubShape(new Triangle());
        square.addSubShape(new Rectangle());

        //Shape drawing=new Drawing(square);
      //  drawing.accept(new DrawingDisplayPartVisitor());

    }
}
