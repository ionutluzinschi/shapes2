import org.junit.Test;
import shapes.visitorPattern.Drawing;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by V3790148 on 5/9/2016.
 */
public class JsonDeserializeTest {
    @Test
    public void JsonDeserializeTest(){
        String fileName="jsonDrawing2.txt";
        InputStream fs;
        try {
            fs = new FileInputStream(fileName);
            JsonReader jsonReader = Json.createReader(fs);
            JsonObject jsonObject=jsonReader.readObject();

            jsonReader.close();
            fs.close();

        }catch(FileNotFoundException e){}
        catch (IOException e){e.printStackTrace();}


    }
}
