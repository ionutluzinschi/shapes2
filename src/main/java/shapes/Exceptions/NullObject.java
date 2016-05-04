package shapes.Exceptions;

/**
 * Created by V3790148 on 5/4/2016.
 */
public class NullObject extends Exception {
    public NullObject(){

    }
    public String toString(){
        return "Attempt to write on Null Object";
    }
}
