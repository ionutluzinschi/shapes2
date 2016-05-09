import org.junit.Test;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.triangle.Triangle;
import shapes.visitorPattern.Drawing;
import shapes.visitorPattern.jsonVisitor.JsonVisitor;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by v3790148 on 5/9/2016.
 */
public class JSONVisitorTest {
    @Test
    public void JsonVisitorTest(){
        Square square=new Square();
        Triangle triangle=new Triangle();
        Circle circle=new Circle();

        square.addSubShape(triangle);
        square.addSubShape(circle);

        Drawing myDrawing=new Drawing(square);
        JsonObjectBuilder myObject= Json.createObjectBuilder();
        JsonVisitor jsonVisitor=new JsonVisitor();
        myDrawing.accept(jsonVisitor);
        myObject.add("drawing",jsonVisitor.getJsonObject());

        try{
        OutputStream os = new FileOutputStream("jsonDrawing.txt");
        JsonWriter jsonWriter = Json.createWriter(os);
        jsonWriter.writeObject(myObject.build());
        jsonWriter.close();}
        catch(FileNotFoundException e){e.printStackTrace();}


    }
}
