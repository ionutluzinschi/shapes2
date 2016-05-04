import org.junit.Test;
import shapes.Shape;
import shapes.visitorPattern.Drawing;
import shapes.visitorPattern.DrawingDisplayPartVisitor;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class VisitorPatternTest {
    @Test
    public void VisitorTest(){
        Shape drawing=new Drawing();
        drawing.accept(new DrawingDisplayPartVisitor());

    }
}
