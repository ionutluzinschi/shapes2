package shapes.visitorPattern.simpleVisitorPattern;

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
import shapes.visitorPattern.Drawing;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class DrawingDisplayPartVisitor implements DrawingPartsVisitor{

    public void visit(Drawing drawing) {
        System.out.println("Displaying drawing.");
    }
    public void visit(Square square) {
        square.draw();
    }
    public void visit(Circle circle) {
        circle.draw();
    }
    public void visit(Rectangle rectangle){
        rectangle.draw();
    }
    public void visit(Triangle triangle) {
       triangle.draw();
    }
    public void visit(Cube cube) {
        cube.draw();
    }
    public void visit(Polygon polygon) {
        polygon.draw();
    }
    public void visit(Cuboid cuboid) {
       cuboid.draw();
    }
    public void visit(Cone cone) {
        cone.draw();
    }
    public void visit(Cylinder cylinder){
        cylinder.draw();
    }
    public void visit(Sphere sphere){
        sphere.draw();
    }


}
