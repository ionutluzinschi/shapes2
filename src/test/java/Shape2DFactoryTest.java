import org.junit.Test;
import shapes.shape2DFactory.Shape2DFactory;
import shapes.Shape;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class Shape2DFactoryTest {
    @Test
    public void Factory2DTest(){
        Shape2DFactory shapeFactory=new Shape2DFactory();
        Shape shape1=shapeFactory.get2DShape("CIRCLE");
        shape1.draw();

        Shape shape2=shapeFactory.get2DShape("Triangle");
        shape2.draw();

        Shape shape3=shapeFactory.get2DShape("Rectangle");
        shape3.draw();

        Shape shape4=shapeFactory.get2DShape("Square");
        shape4.draw();

        Shape shape5=shapeFactory.get2DShape("Ellipse");
        shape5.draw();

        Shape shape6=shapeFactory.get2DShape("Polygon");
        shape6.draw();


    }
}
