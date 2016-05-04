package shapes.shape2DFactory;

import shapes.Exceptions.InvalidCoordinates;
import shapes.Exceptions.InvalidRadius;
import shapes.Exceptions.InvalidValue;
import shapes.Exceptions.OutOfBounds;
import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.shapes2D.rectangle.Polygon;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.round.Ellipse;
import shapes.shapes2D.triangle.Triangle;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class Shape2DFactory {

    public Shape get2DShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("Polygon")) {
            return new Polygon();
        } else if (shapeType.equalsIgnoreCase("Ellipse")) {
            return new Ellipse();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }

    public Shape get2DShape(String shapeType, Point x, double length) throws InvalidRadius, OutOfBounds, InvalidValue {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle(x, length);
        else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square(x, length);
        } else if (shapeType.equalsIgnoreCase("Ellipse")) {
            return new Ellipse(x, x, length);
        }
        return null;
    }

    public Shape get2DShape(String shapeType, Point x, Point y, Point z) throws InvalidRadius, OutOfBounds, InvalidValue {
        if (shapeType == null)
            return null;
        else if (shapeType.equalsIgnoreCase("TRIANGLE"))
            return new Triangle(x, y, z);
        return null;
    }
    public Shape get2DShape(String shapeType,double x,double y) throws InvalidValue {
        if (shapeType == null)
            return null;
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle(x,y);
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square(x);
        }
        return null;
    }


}