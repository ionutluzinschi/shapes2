package shapes.visitorPattern;

import com.fasterxml.jackson.databind.ObjectMapper;
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
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

/**
 * Created by v3790148 on 5/9/2016.
 */
public class JsonVisitor implements Visitor {
    private ObjectMapper objectMapper;
    private JsonObjectBuilder jsonObject=Json.createObjectBuilder();
    private JsonArrayBuilder jsonArray=Json.createArrayBuilder();
    private boolean isSub=false;

    public void visit(Drawing drawing){

    }
    public void visit(Shape shape){
        if(shape instanceof Square)
            visit((Square) shape);
        else if(shape instanceof Circle)
            visit((Circle) shape);
        else if (shape instanceof Triangle)
            visit((Triangle) shape);
        else if(shape instanceof Rectangle)
            visit((Rectangle) shape);
        else if(shape instanceof Polygon)
            visit((Polygon) shape);
        else if(shape instanceof Cone)
            visit((Cone) shape);
        else if(shape instanceof Cylinder)
            visit((Cylinder) shape);
        else if(shape instanceof Sphere)
            visit((Sphere) shape);
    }
    public void visit(Square square){
        JsonObjectBuilder child=Json.createObjectBuilder();
        JsonObjectBuilder coordinates=Json.createObjectBuilder();
        JsonArrayBuilder points=Json.createArrayBuilder();
        child.add("type","square");
        child.add("name",square.getName());
        child.add("length",String.valueOf(square.getLength()));
        child.add("area",String.valueOf(square.getArea()));
        points.add(String.valueOf(square.getCoordinates().getX()));
        points.add(String.valueOf(square.getCoordinates().getY()));
        child.add("coordinates",points);
        if(!isSub)
        { jsonObject.add("main",child); isSub=true;}
        else {
            jsonArray.add(child);

        }
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
        if(!isSub)
        { jsonObject.add("main",child); isSub=true;}
        else{
            jsonArray.add(child);
        }

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
        child.add("upperLeft",points);
        if(!isSub)
        { jsonObject.add("main",child); isSub=true;}
        else{
            jsonArray.add(child);
        }
    }
    public void visit(Polygon polygon){
        JsonObjectBuilder child=Json.createObjectBuilder();
        child.add("name",polygon.getName());
        JsonObjectBuilder coordinates=Json.createObjectBuilder();
        JsonArrayBuilder points=Json.createArrayBuilder();
        child.add("coordinates",points);
        if(!isSub)
        { jsonObject.add("main",child); isSub=true;}
        else{
            jsonArray.add(child);
        }
    }

    public void visit(Cube cube){

    }
    public void visit(Cuboid cuboid){

    }
    public void visit(Cone cone){

    }
    public void visit(Cylinder cylinder){

    }
    public void visit(Sphere sphere){

    }

    public JsonObjectBuilder getJsonObject(){
        jsonObject.add("subshapes",jsonArray);
        return jsonObject;
    }

}
