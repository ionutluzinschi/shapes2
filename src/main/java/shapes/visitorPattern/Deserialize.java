package shapes.visitorPattern;

import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Exceptions.InvalidCoordinates;
import shapes.Shape;
import shapes.shapeFactory.ShapeFactory;
import shapes.shapes2D.base.Point;
import shapes.shapes2D.rectangle.Square;

import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790148 on 5/10/2016.
 */
public class Deserialize {
    private ShapeFactory shapefactory;
    private List<Shape> subShapes=new ArrayList<Shape>();
    private Shape shape;
    private JsonParser jsonParser;
    private JsonObject jsonObject;
    private JsonArray jsonArray;
    private String keyName=null;
    public Deserialize(JsonParser jsonParser){
        this.jsonParser=jsonParser;
    }


    public void getShape() throws InvalidCoordinates, Invalid3DCoordinates{
        while(jsonParser.hasNext()){
            JsonParser.Event event=jsonParser.next();
            if("type".equalsIgnoreCase(keyName)){
                shape=shapefactory.getShape(jsonParser.getString());
            }
            switch(event){
                case KEY_NAME: keyName=jsonParser.getString();break;
                case VALUE_STRING:setStringValues(jsonParser.getString());break;
                case VALUE_NUMBER:setNumberValues(); break;
                case VALUE_NULL: break;
                default:break;
            }
        }

    }

    private void setStringValues(String value) throws InvalidCoordinates,Invalid3DCoordinates{
        if(keyName.equalsIgnoreCase("subshapes")){
            {
                while (jsonParser.hasNext()) {
                    jsonParser.next();
                    if (jsonParser.getString().equalsIgnoreCase("type"))
                        subShapes.add(shapefactory.getShape(value));
                }
                shape.addSubShape(shapefactory.getShape(value));

                if (shape instanceof Square)
                    buildSquare(shape, value);


            }       }
    }
    private void setNumberValues(){

    }
    private void buildSquare(Shape shape,String value) throws InvalidCoordinates{
        switch(keyName){
            case "name":shape.setName(value); break;
            case "length":((Square)shape).setLength(Double.valueOf(value)); break;
            case "coordinates":((Square)shape).setCoordinates(new Point(Double.valueOf(value),Double.valueOf(jsonParser.getString()))); break;
           // case "subshapes":((Square)shape).addSubShape(shapefactory.get2DShape());
        }
    }




}
