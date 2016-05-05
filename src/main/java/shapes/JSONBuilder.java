package shapes;

import org.json.simple.JSONObject;
import shapes.Exceptions.NullObject;
import shapes.shapes2D.base.Point;
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
import shapes.visitorPattern.DrawingDisplayPartVisitor;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;

/**
 * Created by v3790148 on 5/5/2016.
 */
public class JSONBuilder {
  

    Shape shape;
    public JSONBuilder(Shape shape){
       this.shape=shape;
    }
   

    public JsonObjectBuilder getJsonObject() throws NullObject{
        if(shape==null){
            return null;
        }
        if(shape instanceof Triangle)
        {
            JsonObjectBuilder shapeBuilder= Json.createObjectBuilder();
            shapeBuilder.add("name",shape.getName());
            JsonObjectBuilder coordinates=Json.createObjectBuilder();
            JsonArrayBuilder points=Json.createArrayBuilder();
            shapeBuilder.add("area",((Triangle) shape).getArea());
            points.add(((Triangle) shape).getA().getX());
            points.add(((Triangle) shape).getA().getY());
            coordinates.add("PointA",points);
            points.add(((Triangle) shape).getB().getX());
            points.add(((Triangle) shape).getB().getY());
            coordinates.add("PointB",points);
            points.add(((Triangle) shape).getC().getX());
            points.add(((Triangle) shape).getC().getY());
            coordinates.add("PointC",points);
            shapeBuilder.add("coordinates",coordinates);
            JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
            if(shape.getSubShapes().size()>0) {
                for (Shape sh : shape.getSubShapes())
                    subShapesBuilder.add(sh.getJsonObject());
                shapeBuilder.add("subshapes",subShapesBuilder);
            }
            return shapeBuilder;
        }
        else if(shape instanceof Circle){

                JsonObjectBuilder shapeBuilder= Json.createObjectBuilder();
                shapeBuilder.add("name",shape.name);

                JsonArrayBuilder points=Json.createArrayBuilder();
                shapeBuilder.add("area",((Circle) shape).getArea());
                shapeBuilder.add("radius",((Circle) shape).getRadius());
                points.add(((Circle) shape).getCenter().getX());
                points.add(((Circle) shape).getCenter().getY());
                shapeBuilder.add("Center",points);
                JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
                if(shape.getSubShapes().size()>0) {
                    for (Shape sh : shape.getSubShapes())
                        subShapesBuilder.add(sh.getJsonObject());
                    shapeBuilder.add("subshapes",subShapesBuilder);
                }
                return shapeBuilder;
            }
        else if(shape instanceof Ellipse){
            JsonObjectBuilder shapeBuilder= Json.createObjectBuilder();
                shapeBuilder.add("name",shape.getName());
                JsonObjectBuilder coordinates=Json.createObjectBuilder();
                JsonArrayBuilder points=Json.createArrayBuilder();
                shapeBuilder.add("area",((Ellipse) shape).getArea());
                shapeBuilder.add("length",((Ellipse) shape).getRadius());
                points.add(((Ellipse) shape).getCenter().getX());
                points.add(((Ellipse) shape).getCenter().getY());
                coordinates.add("PointA",points);
                points.add(((Ellipse) shape).getCenterB().getX());
                points.add(((Ellipse) shape).getCenterB().getY());
                coordinates.add("PointB",points);
                shapeBuilder.add("coordinates",coordinates);
                JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
                if(shape.getSubShapes().size()>0) {
                    for (Shape sh : shape.getSubShapes())
                        subShapesBuilder.add(sh.getJsonObject());
                    shapeBuilder.add("subshapes",subShapesBuilder);
                }
                return shapeBuilder;
            }
        else if(shape instanceof Square){
            JsonObjectBuilder shapeBuilder= Json.createObjectBuilder();
            JsonObjectBuilder coordinates=Json.createObjectBuilder();
            JsonArrayBuilder points=Json.createArrayBuilder();
            shapeBuilder.add("name",shape.getName());
            shapeBuilder.add("length",((Square) shape).getLength());
            shapeBuilder.add("area",((Square) shape).getArea());
            points.add(((Square) shape).getCoordinates().getX());
            points.add(((Square) shape).getCoordinates().getY());
            shapeBuilder.add("coordinates",coordinates);
            JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
            if(shape.getSubShapes().size()>0) {
                for (Shape sh : shape.getSubShapes())
                    subShapesBuilder.add(sh.getJsonObject());
                shapeBuilder.add("subshapes",subShapesBuilder);
            }
            return shapeBuilder;
    }
        else if(shape instanceof Rectangle){
            JsonObjectBuilder shapeBuilder= Json.createObjectBuilder();
            JsonObjectBuilder coordinates=Json.createObjectBuilder();
            JsonArrayBuilder points=Json.createArrayBuilder();
            shapeBuilder.add("name",shape.getName());
            shapeBuilder.add("length",((Rectangle) shape).getLength());
            shapeBuilder.add("width",((Rectangle) shape).getWidth());
            shapeBuilder.add("area",((Rectangle) shape).getArea());
            points.add(((Rectangle) shape).getCoordinates().getX());
            points.add(((Rectangle) shape).getCoordinates().getY());
            shapeBuilder.add("upperLeft",coordinates);
            JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
            if(shape.getSubShapes().size()>0) {
                for (Shape sh : shape.getSubShapes())
                    subShapesBuilder.add(sh.getJsonObject());
                shapeBuilder.add("subshapes",subShapesBuilder);
            }
            return shapeBuilder;
        }
        else if(shape instanceof Polygon){
                JsonObjectBuilder shapeBuilder= Json.createObjectBuilder();
                shapeBuilder.add("name",shape.getName());
                JsonObjectBuilder coordinates=Json.createObjectBuilder();
                JsonArrayBuilder points=Json.createArrayBuilder();
              //  for(Point pts: (((Polygon) shape).getPoints())) {
            //        points.add(pts.getX());
            //        points.add(pts.getY());
            //        coordinates.add("",points);
           //     }

                shapeBuilder.add("coordinates",coordinates);
                JsonArrayBuilder subShapesBuilder=Json.createArrayBuilder();
                if(shape.getSubShapes().size()>0) {
                    for (Shape sh : shape.getSubShapes())
                        subShapesBuilder.add(sh.getJsonObject());
                    shapeBuilder.add("subshapes",subShapesBuilder);
                }
                return shapeBuilder;
            }
        else if(shape instanceof Cube){}
        else if(shape instanceof Cuboid){}
        else if(shape instanceof Pyramid){}
        else if(shape instanceof SquarePyramid){}
        else if(shape instanceof Cone){}
        else if(shape instanceof Cylinder){}
        else if(shape instanceof Sphere){}
        return null;


    }



}
