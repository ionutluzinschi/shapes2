package shapes.shapes2D.rectangle;

import java.util.ArrayList;
import java.util.List;

import shapes.shapes2D.Shape;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Polygon implements Shape {

    List<Point> list= new ArrayList<Point>();
    private boolean initialised=false;

    public Polygon(){
    initialised=true;
    }

    public Polygon(Point... points){
        for(Point x:points)
        {
            if(x.getX()>=0 && x.getY()>=0)
                list.add(x);

        }
        initialised=true;
    }

    public void draw(){
    }

    public boolean getState(){
        return initialised;
    }


    public String toString(){
        return list.toString();
    }

}
