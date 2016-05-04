import org.junit.Assert;
import org.junit.Test;
import shapes.Exceptions.InvalidValue;
import shapes.Shape;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class AreaTest {
    @Test
    public void TestArea(){
        try {
            Shape square = new Square(2);
            Assert.assertEquals(4, ((Square) square).getArea(), 0);
        }catch(InvalidValue e){}
     try {
         Shape rectangle = new Rectangle(4, 5);
         Assert.assertEquals(20, ((Rectangle) rectangle).getArea(), 0);
     }catch(InvalidValue e){}
    }
}

