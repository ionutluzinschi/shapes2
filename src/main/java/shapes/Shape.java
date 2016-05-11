package shapes;

import org.codehaus.jackson.annotate.JsonIgnore;
import shapes.visitorPattern.Visitor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by V3790148 on 4/26/2016.
 */

public abstract class Shape implements Serializable{
    protected String name="shape";

    @JsonIgnore
    protected List<Shape> subShapes=new ArrayList<Shape>();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void addSubShape(Shape sh){
        subShapes.add(sh);
    }
    public void removeSubShape(Shape sh){
        subShapes.remove(sh);
    }

    public List<Shape> getSubShapes(){
        return subShapes;
    }
    public double getArea(){ return AreaCalculator.calculateArea(this); }

    public abstract void accept(Visitor partVisitor);

    public abstract void draw();
    public String toString(){
        return this.toString();
    }
}
