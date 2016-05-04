import org.junit.Test;
import shapes.Shape;
import shapes.shape3DFactory.Shape3DFactory;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class Shape3DFactoryTest {
    @Test
    public void Factory3DTest(){

        Shape3DFactory shape3DFactory=new Shape3DFactory();
        Shape shape1=shape3DFactory.get3DShape("Cube");
        shape1.draw();

        Shape shape2=shape3DFactory.get3DShape("Cuboid");
        shape2.draw();

        Shape shape3=shape3DFactory.get3DShape("Pyramid");
        shape3.draw();

        Shape shape4=shape3DFactory.get3DShape("Square Pyramid");
        shape4.draw();


        Shape shape5=shape3DFactory.get3DShape("Cone");
        shape5.draw();


        Shape shape6=shape3DFactory.get3DShape("Cylinder");
        shape6.draw();


        Shape shape7=shape3DFactory.get3DShape("Sphere");
        shape7.draw();


    }
}
