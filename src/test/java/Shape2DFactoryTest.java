import org.junit.Test;
import shapes.Exceptions.InvalidCoordinates;
import shapes.Exceptions.InvalidRadius;
import shapes.Exceptions.InvalidValue;
import shapes.Exceptions.OutOfBounds;
import shapes.shape2DFactory.Shape2DFactory;
import shapes.Shape;
import shapes.shapes2D.base.Point;

import java.util.Random;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class Shape2DFactoryTest {
    @Test
    public void Factory2DTest(){
        Shape2DFactory shapeFactory=new Shape2DFactory();
        double x,y,z;

        Random r=new Random();
        for (int i = 0; i < 5; i++) {
            x = r.nextDouble() * 15-5;
            y = r.nextDouble() * 15-5;
            z = r.nextDouble() * 15-5;
            try {

                     Shape shape1=shapeFactory.get2DShape("circle");
                    shape1 = shapeFactory.get2DShape("CIRCLE", new Point(x, y), z);

            } catch(InvalidCoordinates e){System.out.println(e); }
                catch(OutOfBounds e){ System.out.println(e);}
            catch(InvalidValue e){ System.out.println(e);}
            catch(InvalidRadius e) { System.out.println(e);}
            try {
                Shape shape4 = shapeFactory.get2DShape("square", new Point(x, y), z);

            } catch(InvalidCoordinates e){System.out.println(e); }
            catch(OutOfBounds e){ System.out.println(e);}
            catch(InvalidValue e){ System.out.println(e);}
            catch(InvalidRadius e){ System.out.println(e);}

            try{
                Shape shape2=shapeFactory.get2DShape("Triangle",new Point(x,y),new Point(x,z),new Point(y,z));
            }catch(InvalidCoordinates e){System.out.println(e); }
            catch(OutOfBounds e){ System.out.println(e);}
            catch(InvalidValue e){ System.out.println(e);}
            catch(InvalidRadius e){ System.out.println(e);}
            try{Shape shape3=shapeFactory.get2DShape("Rectangle",x,y);}
            catch(InvalidValue e){System.out.println(e);}
            try{Shape shape4=shapeFactory.get2DShape("square",x,y);}
            catch(InvalidValue e){System.out.println(e);}

        }


        Shape shape3=shapeFactory.get2DShape("Rectangle");

        Shape shape5=shapeFactory.get2DShape("Ellipse");

        Shape shape6=shapeFactory.get2DShape("Polygon");



    }
}
