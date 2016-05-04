import org.junit.Test;
import shapes.Shape;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.triangle.Triangle;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class CompositeTest {
    @Test
    public void CompositeTest(){
        Shape square=new Square();
        Shape triangle=new Triangle();
        Shape rectangle=new Rectangle();
        Shape circle=new Circle();


        square.addSubShape(triangle);
        square.addSubShape(rectangle);
        triangle.addSubShape(circle);
        circle.addSubShape(rectangle);

        square.draw();
        circle.draw();
      }
}
