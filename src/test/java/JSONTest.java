import org.junit.Test;
import shapes.Shape;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.triangle.Triangle;

import javax.json.*;
import java.io.*;

/**
 * Created by v3790148 on 5/5/2016.
 */
public class JSONTest {

    @Test
    public void JSONTest() throws  FileNotFoundException{
        Shape triangle=new Triangle();
        Shape square=new Square();
        Shape circle=new Circle();

        triangle.addSubShape(square);
        triangle.addSubShape(circle);

        System.out.println("Shape JSON String\n"+triangle.getJsonObject().build());
        OutputStream os = new FileOutputStream("shapes.txt");
        JsonWriter jsonWriter = Json.createWriter(os);
        jsonWriter.writeObject(triangle.getJsonObject().build());
        jsonWriter.close();
    }

}
