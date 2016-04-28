import shapes.shapes2D.triangle.Triangle;
import org.junit.Assert;
import org.junit.Test;
import shapes.shapes2D.base.Point;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Test1 {

    @Test
    public void testTriangle(){

        Triangle[] one = new Triangle[4];
        one[0]=new Triangle(5, 8);
        one[1]=new Triangle(new Point(5,5),new Point(2,3),new Point(12,10));
        one[2]=new Triangle(-2,5);
        one[3]=new Triangle(new Point(-1,-1),new Point(-2,3),new Point(12,10));

        Assert.assertTrue(one[0].getState());

        for(int i=0;i<2;i++)
                Assert.assertTrue(one[i].getState());

        for(int i=2;i<4;i++)
                Assert.assertFalse(one[i].getState());


        one[3].setSize(5,10);
        Assert.assertFalse(one[3].getState());

    }

    @Test
    public void testRectangle(){

    }


    @Test
    public void testPolygon(){

    }

    @Test
    public void testSquare(){

    }
    @Test
    public void testCircle(){

    }
    @Test
    public void testElipse(){

    }

    @Test
    public void testPoint3D(){
        Point3D myPoint=new Point3D(5,7,8);
        Assert.assertEquals(5,myPoint.getX());
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
