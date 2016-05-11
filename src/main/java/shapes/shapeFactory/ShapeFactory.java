package shapes.shapeFactory;

import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Exceptions.InvalidCoordinates;
import shapes.Shape;
import shapes.shapes2D.rectangle.Polygon;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.triangle.Triangle;
import shapes.shapes3D.cuboids.Cube;
import shapes.shapes3D.cuboids.Cuboid;
import shapes.shapes3D.round3D.Cone;
import shapes.shapes3D.round3D.Cylinder;
import shapes.shapes3D.round3D.Sphere;

/**
 * Created by V3790148 on 5/11/2016.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) throws InvalidCoordinates,Invalid3DCoordinates {
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
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        } else if(shapeType.equalsIgnoreCase("Cuboid"))
            return new Cuboid();
        else if(shapeType.equalsIgnoreCase("Cylinder"))
            return new Cylinder();
        else if(shapeType.equalsIgnoreCase("Sphere"))
            return new Sphere();
        else if(shapeType.equalsIgnoreCase("Cone"))
            return new Cone();
        else if(shapeType.equalsIgnoreCase("Cube"))
            return new Cube();
        return null;
    }
}
