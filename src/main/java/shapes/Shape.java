package shapes;

import jdk.nashorn.api.scripting.JSObject;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import shapes.Exceptions.NullObject;
import shapes.visitorPattern.DrawingPartsVisitor;

import javax.json.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790148 on 4/26/2016.
 */

public abstract class Shape{

    protected String name="shape";
    protected boolean initialised=false;
    List<Shape> subShapes=new ArrayList<Shape>();

    public boolean getState(){
        return initialised;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    //  Composite pattern
    public void addSubShape(Shape sh){
        subShapes.add(sh);
    }
    public void removeSubShape(Shape sh){
        subShapes.remove(sh);
    }
    public List<Shape> getSubShapes(){
        return subShapes;
    }

    //visitor pattern
    public abstract void accept(DrawingPartsVisitor drawingPartVisitor);

    //shape to json
    public JsonObjectBuilder getJsonObject(){

       JsonObjectBuilder myBuild= Json.createObjectBuilder();
       JSONBuilder myBuilder=new JSONBuilder(this);
        try {
            myBuild=myBuilder.getJsonObject();
        }
        catch(NullObject e){e.printStackTrace();}

 
        return myBuild;

    }

    public abstract void draw();
    public String toString(){
        return this.toString();
    }
}
