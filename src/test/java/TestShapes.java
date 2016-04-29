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

        Point A=new Point(1,2);
        Point B=new Point(3,3);
        Point C=new Point(5,2);
        Point D=new Point (3,2);
        Point a=new Point(-1,-4);
        Point b=new Point(-3,-4);
        Point c=new Point (-2,-4);

        Triangle[] triangles = new Triangle[15];
        triangles[0]=new Triangle(5, 8);
        triangles[1]=new Triangle(new Point(5,5),new Point(2,3),new Point(12,10));
        triangles[2]=new Triangle();
        triangles[3]=new Triangle("Euclid");
        triangles[4]=new Triangle(1,2,"Eureka");
        triangles[5]=new Triangle(A,B,C,"Euclid");
        triangles[6]=new Triangle(-1,-1);
        triangles[7]=new Triangle(a,b,c);
        triangles[8]=new Triangle(A,C,D);
        triangles[9]=new Triangle(1,2,3,4,5,6);
        triangles[10]=new Triangle(-1,2,-2,4,5,3);
        triangles[11]=new Triangle(1,2,5,2,3,2);

        // for(int i=0;i<12;i++)
        // System.out.println(i+" "+triangles[i]);

       Assert.assertEquals(20,triangles[0].getArea(),1);

        Assert.assertEquals(-1,triangles[6].getArea(),0);
        Assert.assertEquals(A,triangles[5].getA());
        Assert.assertEquals(0,triangles[6].getA().getX(),0);
        Assert.assertEquals(1,triangles[5].getA().getX(),0);
        Assert.assertEquals(5,triangles[0].getBase(),0);
        Assert.assertEquals(3,triangles[5].getB().getX(),0);
        Assert.assertEquals(5,triangles[5].getC().getX(),0);
        Assert.assertEquals(8,triangles[0].getHeight(),1);
        Assert.assertEquals(true,triangles[0].getState());
        Assert.assertEquals(false,triangles[8].getState());




    }

    @Test
    public void testRectangle(){
        Point A=new Point(1,2);
        Point B=new Point(3,3);
        Point a=new Point(-2,1);
        Point b=new Point (-2,0);

        Rectangle[] rectangles=new Rectangle[15];

        rectangles[0]=new Rectangle();
        rectangles[1]=new Rectangle("Rectangular");
        rectangles[2]=new Rectangle(3,4);
        rectangles[3]=new Rectangle(2,3,"MY Rectangle");
        rectangles[4]=new Rectangle(A,B);
        rectangles[5]=new Rectangle(A,B,"rectangle with points");
        rectangles[6]=new Rectangle(1,2,3,4);
        rectangles[7]=new Rectangle(1,2,5,8,"Name");
        rectangles[8]=new Rectangle(-1,-8);
        rectangles[9]=new Rectangle(2,-8,"neinitializat");
        rectangles[10]=new Rectangle(a,b);
        rectangles[11]=new Rectangle(a,b,"neinitializat");

        Assert.assertEquals(true,rectangles[0].getState());
        Assert.assertEquals(false,rectangles[8].getState());
        Assert.assertEquals("Rectangle",rectangles[0].getName());
        Assert.assertEquals(4,rectangles[2].getLength(),0);
        Assert.assertEquals(3,rectangles[2].getWidth(),0);


        for(int i=0;i<12;i++)
            System.out.println(i+" "+rectangles[i]);

    }

    @Test
    public void testSquare(){
        Point A=new Point(1,2);
        Point B=new Point(3,3);
        Point a=new Point(-2,1);
        Point b=new Point (-2,0);

        Square[] squares=new Square[15];

        squares[0]=new Square();
        squares[1]=new Square("My Square");
        squares[2]=new Square(2);
        squares[3]=new Square(3,"Squaree");
        squares[4]=new Square(1,2,4);
        squares[5]=new Square(1,2,6,"Square");
        squares[6]=new Square(A,5);
        squares[7]=new Square(B,4,"Square with point");
        squares[8]=new Square(a,4);
        squares[9]=new Square(-2);

        for(int i=0;i<10;i++)
            System.out.println(i+" "+squares[i]);

        Assert.assertEquals(4,squares[2].getArea(),0);
        Assert.assertEquals(-1,squares[8].getArea(),0);
        Assert.assertEquals(true,squares[2].getState());
        Assert.assertEquals(false,squares[8].getState());
        Assert.assertEquals(A.getX(),squares[6].getCoordinates().getX(),0);

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
