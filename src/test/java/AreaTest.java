import org.junit.Assert;
import org.junit.Test;
import shapes.Exceptions.InvalidCoordinates;
import shapes.Exceptions.InvalidValue;
import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class AreaTest {
    @Test
    public void TestArea(){
        try {
            Shape square = new Square();
            Assert.assertEquals(9, ((Square) square).getArea(), 0);
        }
            catch(InvalidCoordinates e){}
     try {
         Shape rectangle = new Rectangle();
         //Assert.assertEquals(20, ((Rectangle) rectangle).getArea(), 0);
     }catch(InvalidCoordinates e){}
    }
}

