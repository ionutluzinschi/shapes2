package shapes.visitorPattern;

import shapes.Shape;
import shapes.shapes2D.rectangle.Polygon;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.round.Ellipse;
import shapes.shapes2D.triangle.Triangle;
import shapes.shapes3D.cuboids.Cube;
import shapes.shapes3D.cuboids.Cuboid;
import shapes.shapes3D.pyramids.Pyramid;
import shapes.shapes3D.pyramids.SquarePyramid;
import shapes.shapes3D.round3D.Cone;
import shapes.shapes3D.round3D.Cylinder;
import shapes.shapes3D.round3D.Sphere;
import shapes.visitorPattern.Drawing;

import javax.json.JsonObjectBuilder;

/**
 * Created by v3790148 on 5/9/2016.
 */
public interface Visitor {
    public void visit(Drawing drawing);
    // public void visit(JsonVisitor jsonVisitor);
    public void visit(Shape shape);
    public void visit(Square square);
    public void visit(Circle circle);
    public void visit(Triangle triangle);
    public void visit(Rectangle rectangle);
    public void visit(Pyramid pyramid);
    public void visit(Polygon polygon);
    public void visit(Ellipse ellipse);
    public void visit(Cube cube);
    public void visit(Cuboid cuboid);
    public void visit(SquarePyramid squarePyramid);
    public void visit(Cone cone);
    public void visit(Cylinder cylinder);
    public void visit(Sphere sphere);

}
