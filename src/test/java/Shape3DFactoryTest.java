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
        System.out.println(shape1);
        shape1.draw();

        Shape shape2=shape3DFactory.get3DShape("Cuboid");
        System.out.println(shape2);
        shape2.draw();

        Shape shape3=shape3DFactory.get3DShape("Pyramid");
        System.out.println(shape3);
        shape3.draw();

        Shape shape4=shape3DFactory.get3DShape("Square Pyramid");
        System.out.println(shape4);
        shape4.draw();


        Shape shape5=shape3DFactory.get3DShape("Cone");
        System.out.println(shape5);
        shape5.draw();


        Shape shape6=shape3DFactory.get3DShape("Cylinder");
        System.out.println(shape6);
        shape6.draw();


        Shape shape7=shape3DFactory.get3DShape("Sphere");
        System.out.println(shape7);
        shape7.draw();


    }
}
