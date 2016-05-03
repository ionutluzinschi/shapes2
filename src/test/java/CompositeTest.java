import org.junit.Test;
import shapes.Composite;
import shapes.Shape;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.round.Ellipse;
import shapes.shapes2D.triangle.Triangle;
import shapes.shapes3D.round3D.Cone;
import shapes.shapes3D.round3D.Cylinder;
import shapes.shapes3D.round3D.Sphere;
import shapes.shapes3D.cuboids.Cube;
import shapes.shapes3D.pyramids.Pyramid;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class CompositeTest {
    @Test
    public void CompositeTest(){
        Composite square=new Composite(new Square());
        Composite triangle=new Composite(new Triangle());
        Composite rectangle=new Composite(new Rectangle());
        Composite circle=new Composite(new Circle());


        square.addSubShape(triangle);
        square.addSubShape(rectangle);

        circle.addSubShape(triangle);

        square.draw();
        circle.draw();
      }
}
