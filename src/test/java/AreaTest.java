import org.junit.Assert;
import org.junit.Test;
import shapes.Shape;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class AreaTest {
    @Test
    public void TestArea(){
    Shape square=new Square(2);
        Assert.assertEquals(4,square.getArea(),0);

     Shape rectangle=new Rectangle(4,5);
        Assert.assertEquals(20, rectangle.getArea(),0);



    }
}
