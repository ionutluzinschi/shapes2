package shapes.visitorPattern.jsonVisitor;

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
import shapes.visitorPattern.Visitor;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

/**
 * Created by v3790148 on 5/9/2016.
 */
public class JsonVisitor implements Visitor {

    JsonObjectBuilder jsonObject=Json.createObjectBuilder();

    public void visit(Drawing drawing){
    }
    public void visit(Shape shape){
    }
    public void visit(Square square){
        JSONBuilder builder=new JSONBuilder(square);
        jsonObject.add(square.getName(),builder.getJsonObject());
    }
    public void visit(Circle circle){
        JSONBuilder builder=new JSONBuilder(circle);
        jsonObject.add(circle.getName(),builder.getJsonObject());
    }
    public void visit(Triangle triangle){
        JSONBuilder builder=new JSONBuilder(triangle);
        jsonObject.add(triangle.getName(),builder.getJsonObject());
    }
    public void visit(Rectangle rectangle){
        JSONBuilder builder=new JSONBuilder(rectangle);
        jsonObject.add(rectangle.getName(),builder.getJsonObject());
    }
    public void visit(Pyramid pyramid){
        JSONBuilder builder=new JSONBuilder(pyramid);
        jsonObject.add(pyramid.getName(),builder.getJsonObject());
    }
    public void visit(Polygon polygon){
        JSONBuilder builder=new JSONBuilder(polygon);
        jsonObject.add(polygon.getName(),builder.getJsonObject());
    }
    public void visit(Ellipse ellipse){
        JSONBuilder builder=new JSONBuilder(ellipse);
        jsonObject.add(ellipse.getName(),builder.getJsonObject());
    }
    public void visit(Cube cube){
        JSONBuilder builder=new JSONBuilder(cube);
        jsonObject.add(cube.getName(),builder.getJsonObject());
    }
    public void visit(Cuboid cuboid){
        JSONBuilder builder=new JSONBuilder(cuboid);
        jsonObject.add(cuboid.getName(),builder.getJsonObject());
    }
    public void visit(SquarePyramid squarePyramid){
        JSONBuilder builder=new JSONBuilder(squarePyramid);
        jsonObject.add(squarePyramid.getName(),builder.getJsonObject());
    }
    public void visit(Cone cone){
        JSONBuilder builder=new JSONBuilder(cone);
        jsonObject.add(cone.getName(),builder.getJsonObject());
    }
    public void visit(Cylinder cylinder){
        JSONBuilder builder=new JSONBuilder(cylinder);
        jsonObject.add(cylinder.getName(),builder.getJsonObject());
    }
    public void visit(Sphere sphere){
        JSONBuilder builder=new JSONBuilder(sphere);
        jsonObject.add(sphere.getName(),builder.getJsonObject());
    }

    public JsonObjectBuilder getJsonObject(){
        return jsonObject;
    }

}
