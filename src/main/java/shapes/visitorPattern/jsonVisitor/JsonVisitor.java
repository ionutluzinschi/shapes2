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
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

/**
 * Created by v3790148 on 5/9/2016.
 */
public class JsonVisitor implements Visitor {

    //private JsonObjectBuilder jsonObject=Json.createObjectBuilder();
    private JsonArrayBuilder jsonArray=Json.createArrayBuilder();
    public void visit(Drawing drawing){
    }
    public void visit(Shape shape){
    }
    public void visit(Square square){
        JsonObjectBuilder child=Json.createObjectBuilder();
        JsonObjectBuilder coordinates=Json.createObjectBuilder();
        JsonArrayBuilder points=Json.createArrayBuilder();
        child.add("name",square.getName());
        child.add("length",square.getLength());
        child.add("area",square.getArea());
        points.add(square.getCoordinates().getX());
        points.add(square.getCoordinates().getY());
        child.add("coordinates",coordinates);
        JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
        if(square.getSubShapes().size()>0) {
            for (Shape sh : square.getSubShapes())
                    sh.accept(this);
            child.add("subshapes",subShapesBuilder);
        }
        jsonArray.add(child);



    }
    public void visit(Circle circle){
        JsonObjectBuilder child=Json.createObjectBuilder();
        child.add("name",circle.getName());

        JsonArrayBuilder points=Json.createArrayBuilder();
        child.add("area",circle.getArea());
        child.add("radius",circle.getRadius());
        points.add(circle.getCenter().getX());
        points.add(circle.getCenter().getY());
        child.add("Center",points);
        JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
        if(circle.getSubShapes().size()>0) {
            for (Shape sh : circle.getSubShapes())
                sh.accept(this);
            child.add("subshapes",subShapesBuilder);
            child.add("subshapes",subShapesBuilder);
        }
        jsonArray.add(child);

    }
    public void visit(Triangle triangle){
        JsonObjectBuilder child=Json.createObjectBuilder();
        child.add("name",triangle.getName());
        JsonObjectBuilder coordinates=Json.createObjectBuilder();
        JsonArrayBuilder points=Json.createArrayBuilder();
        child.add("area",triangle.getArea());
        points.add(triangle.getA().getX());
        points.add(triangle.getA().getY());
        coordinates.add("PointA",points);
        points.add(triangle.getB().getX());
        points.add(triangle.getB().getY());
        coordinates.add("PointB",points);
        points.add(triangle.getC().getX());
        points.add(triangle.getC().getY());
        coordinates.add("PointC",points);
        child.add("coordinates",coordinates);
        JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
        if(triangle.getSubShapes().size()>0) {
            for (Shape sh : triangle.getSubShapes())
                sh.accept(this);
            child.add("subshapes",subShapesBuilder);
        }
        jsonArray.add(child);
    }
    public void visit(Rectangle rectangle){
        JsonObjectBuilder child=Json.createObjectBuilder();
        JsonObjectBuilder coordinates=Json.createObjectBuilder();
        JsonArrayBuilder points=Json.createArrayBuilder();
        child.add("name",rectangle.getName());
        child.add("length",rectangle.getLength());
        child.add("width",rectangle.getWidth());
        child.add("area",rectangle.getArea());
        points.add(rectangle.getCoordinates().getX());
        points.add(rectangle.getCoordinates().getY());
        child.add("upperLeft",coordinates);
        JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
        if(rectangle.getSubShapes().size()>0) {
            for (Shape sh : rectangle.getSubShapes())
                sh.accept(this);
            child.add("subshapes",subShapesBuilder);
        }
        jsonArray.add(child);
    }

    public void visit(Polygon polygon){
        JsonObjectBuilder child=Json.createObjectBuilder();
        child.add("name",polygon.getName());
        JsonObjectBuilder coordinates=Json.createObjectBuilder();
        JsonArrayBuilder points=Json.createArrayBuilder();
        //  for(Point pts: (((Polygon) shape).getPoints())) {
        //        points.add(pts.getX());
        //        points.add(pts.getY());
        //        coordinates.add("",points);
        //     }

        child.add("coordinates",coordinates);
        JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
        if(polygon.getSubShapes().size()>0) {
            for (Shape sh : polygon.getSubShapes())
                sh.accept(this);
            child.add("subshapes",subShapesBuilder);
        }
        jsonArray.add(child);
    }

    public void visit(Ellipse ellipse){
        JsonObjectBuilder child=Json.createObjectBuilder();
        child.add("name",ellipse.getName());
        JsonObjectBuilder coordinates=Json.createObjectBuilder();
        JsonArrayBuilder points=Json.createArrayBuilder();
        child.add("area",ellipse.getArea());
        child.add("length",ellipse.getRadius());
        points.add(ellipse.getCenter().getX());
        points.add(ellipse.getCenter().getY());
        coordinates.add("PointA",points);
        points.add(ellipse.getCenterB().getX());
        points.add(ellipse.getCenterB().getY());
        coordinates.add("PointB",points);
        child.add("coordinates",coordinates);
        JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
        if(ellipse.getSubShapes().size()>0) {
            for (Shape sh : ellipse.getSubShapes())
                sh.accept(this);
            child.add("subshapes",subShapesBuilder);
        }
        jsonArray.add(child);

    }
    public void visit(Pyramid pyramid){

    }
    public void visit(Cube cube){

    }
    public void visit(Cuboid cuboid){

    }
    public void visit(SquarePyramid squarePyramid){

    }
    public void visit(Cone cone){

    }
    public void visit(Cylinder cylinder){

    }
    public void visit(Sphere sphere){

    }
    public JsonArrayBuilder getJsonObject(){
        return jsonArray;
    }

}
