import shapes.Exceptions.InvalidCoordinates;
import shapes.Exceptions.InvalidValue;
import shapes.Exceptions.NullObject;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.triangle.Triangle;
import org.junit.Assert;
import org.junit.Test;
import shapes.shapes2D.base.Point;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class TestShapes {

    @Test
    public void testTriangle(){
        System.out.println("Testing triangles");
        Triangle[] triangles = new Triangle[10];
        try {
            Point A = new Point(1, 2);
            Point B=new Point(3,3);
            Point C=new Point(5,2);

            triangles[0]=new Triangle(new Point(0,0),new Point(3,0),new Point(0,4));
            triangles[1]=new Triangle(A,B,C,"Euclid");
          } catch(InvalidCoordinates e) {System.out.println(e);}

        Assert.assertEquals(6,triangles[0].getArea(),0);
        Assert.assertEquals(3,triangles[0].getCathetusA(),0);
        Assert.assertEquals(4,triangles[0].getCathetusB(),0);
        Assert.assertEquals(5,triangles[0].getDiagonal(),0);

        try {
            Point a=new Point(-1,-4);
            triangles[5]=new Triangle(a,a,a);

        } catch(InvalidCoordinates e) {System.out.println(e);}

    }

    @Test
    public void testRectangle() {
        System.out.println("Testing rectangles");
        Rectangle[] rectangles = new Rectangle[15];
        try {
            Point A = new Point(1, 2);
            Point B = new Point(3, 3);
            Point a = new Point(-2, 1);
            Point b = new Point(-2, 0);

            rectangles[0] = new Rectangle();
            rectangles[1] = new Rectangle("Rectangular");
            rectangles[2] = new Rectangle(3, 4);
            rectangles[3] = new Rectangle(2, 3, "MY Rectangle");
            rectangles[4] = new Rectangle(A, B);
            rectangles[5] = new Rectangle(A, B, "rectangle with points");
            rectangles[8] = new Rectangle(-1, -8);
            rectangles[9] = new Rectangle(2, -8, "neinitializat");
            rectangles[10] = new Rectangle(a, b);
            rectangles[11] = new Rectangle(a, b, "neinitializat");
            Assert.assertEquals(true, rectangles[0].getState());
            Assert.assertEquals(false, rectangles[8].getState());
            Assert.assertEquals("Rectangle", rectangles[0].getName());
            Assert.assertEquals(4, rectangles[2].getLength(), 0);
            Assert.assertEquals(3, rectangles[2].getWidth(), 0);
            Assert.assertEquals(12, rectangles[2].getArea(), 0);

            rectangles[2].setCoordinates(4, 5);
                Assert.assertEquals(20, rectangles[2].getArea(), 0);

        }
        catch (InvalidValue e ){System.out.println(e);}
        catch( NullObject e){System.out.println(e);}
        catch (InvalidCoordinates e) {System.out.println(e);}
    }



    @Test
    public void testSquare(){
        System.out.println("Testing Squares");
        Square[] squares=new Square[15];
        try {
        Point A=new Point(1,2);
        Point B=new Point(3,3);
        Point a=new Point(-2,1);
        Point b=new Point (-2,0);

        squares[0]=new Square();
        squares[1]=new Square("My Square");
        squares[2]=new Square(2);
        squares[3]=new Square(3,"Squaree");
        squares[6]=new Square(A,5);
        squares[7]=new Square(B,4,"Square with point");
        squares[8]=new Square(a,4);
        squares[9]=new Square(-2);

        for(int i=0;i<10;i++)
            System.out.println(i+" "+squares[i]);

        Assert.assertEquals(4,squares[2].getArea(),0);
        Assert.assertEquals(0,squares[8].getArea(),0);
        Assert.assertEquals(true,squares[2].getState());
        Assert.assertEquals(false,squares[8].getState());
        Assert.assertEquals(A.getX(),squares[6].getCoordinates().getX(),0);
        }
        catch (InvalidValue e ){System.out.println(e);}
        catch (InvalidCoordinates e) {System.out.println(e);}
    }

    @Test
    public void testPolygon(){

    }


    @Test
    public void testCircle(){

    }
    @Test
    public void testElipse(){

    }

    @Test
    public void testPoint3D(){


    }

    @Test
    public void testCube(){

    }
    @Test
    public void testCuboid(){

    }
    @Test
    public void testPyramid(){

    }
    @Test
    public void testSquarePyramid(){

    }
    @Test
    public void testCone(){

    }
    @Test
    public void testCylinder(){

    }
    @Test
    public void testSphere() {

    }

}
