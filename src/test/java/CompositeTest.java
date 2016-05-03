import org.junit.Test;
import shapes.Shape;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.round.Ellipse;
import shapes.shapes2D.triangle.Triangle;
import shapes.shapes3D.Cone;
import shapes.shapes3D.Cylinder;
import shapes.shapes3D.Sphere;
import shapes.shapes3D.cuboids.Cube;
import shapes.shapes3D.pyramids.Pyramid;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class CompositeTest {
    @Test
    public void CompositeTest(){
        Shape first=new Shape(new Square());
        Shape triangle=new Shape(new Triangle());
        Shape rectangle=new Shape(new Rectangle());
        Shape circle=new Shape(new Circle());
        Shape ellipse=new Shape(new Ellipse());
        Shape cube=new Shape(new Cube());
        Shape pyramid=new Shape(new Pyramid());
        Shape cone=new Shape(new Cone());
        Shape cylinder=new Shape(new Cylinder());
        Shape sphere=new Shape(new Sphere());

        first.addSubShape(sphere);
        first.addSubShape(triangle);
        triangle.addSubShape(rectangle);
        triangle.addSubShape(circle);
        circle.addSubShape(ellipse);
        circle.addSubShape(cube);
        cube.addSubShape(pyramid);
        pyramid.addSubShape(cylinder);
        sphere.addSubShape(cone);
        first.addSubShape(cube);


        first.draw();

       // triangle.draw();
        //circle.draw();
      //  cube.draw();
      //  pyramid.draw();
      //  sphere.draw();




    }
}
