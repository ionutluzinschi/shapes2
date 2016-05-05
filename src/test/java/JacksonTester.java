import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.junit.Test;
import shapes.Shape;
import shapes.shapes2D.triangle.Triangle;

import java.io.File;
import java.io.IOException;

/**
 * Created by v3790148 on 5/5/2016.
 */
public class JacksonTester {

    @Test
    public void JacksonTester(){
        JacksonTester tester= new JacksonTester();

        try{
            Shape triangle=new Triangle();

            tester.writeJSON(triangle);
        }
        catch (JsonParseException e) { e.printStackTrace(); }
        catch (JsonMappingException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
    }

    public void writeJSON(Shape shape) throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
        mapper.writeValue(new File("shape.json"), shape);
    }

    private Shape readJSON() throws JsonParseException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        Shape shape = mapper.readValue(new File("shape.json"), Triangle.class);
        return shape;
    }

}
