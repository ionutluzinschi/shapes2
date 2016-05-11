import org.junit.Test;
import shapes.Exceptions.InvalidCoordinates;
import shapes.Exceptions.InvalidRadius;
import shapes.Exceptions.InvalidValue;
import shapes.Exceptions.OutOfBounds;
import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.triangle.Triangle;
import shapes.visitorPattern.Drawing;
import shapes.visitorPattern.XmlVisitor;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import static javax.script.ScriptEngine.FILENAME;

/**
 * Created by v3790148 on 5/9/2016.
 */
public class XmlTest {
    @Test
    public void XmlTest() throws InvalidCoordinates {
        String fileName = "xmlTest.txt";
        Square square = new Square();

            square = new Square();
            square.setLength(4);
            square.setName("mySquare");

        Triangle triangle = new Triangle();
        try {
            triangle = new Triangle(new Point(2, 1), new Point(4, 5), new Point(4, 1));
        } catch (InvalidCoordinates e) {
            e.printStackTrace();
        }

        Circle circle = new Circle();
        try {
            circle = new Circle(new Point(7, 7), 3);
        } catch (InvalidCoordinates e) {
            e.printStackTrace();
        } catch (InvalidRadius e) {
            e.printStackTrace();
        } catch (OutOfBounds e) {
            e.printStackTrace();
        }

        square.addSubShape(triangle);
        square.addSubShape(circle);

        Drawing myDrawing = new Drawing(square);

        XmlVisitor visitor = new XmlVisitor(fileName);
        myDrawing.accept(visitor);
        visitor.encode();
        visitor.closeEncoder();

try{
        XMLDecoder decoder = new XMLDecoder(new FileInputStream(fileName));
        List<Shape> listFromFile = (List<Shape>) decoder.readObject();
        decoder.close();

        System.out.println("Reading list: " + listFromFile);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }


    }
}
