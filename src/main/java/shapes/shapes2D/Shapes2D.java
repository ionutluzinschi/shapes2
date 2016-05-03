package shapes.shapes2D;


import shapes.AreaCalculator;
import shapes.Shape;


import java.util.List;

/**
 * Created by V3790148 on 5/3/2016.
 */
public abstract class Shapes2D extends Shape {

    public double getArea(){
        return AreaCalculator.calculateArea(this);
    }

}
