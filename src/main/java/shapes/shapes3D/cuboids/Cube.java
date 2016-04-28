package shapes.shapes3D.cuboids;

import shapes.shapes2D.base.Point;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cube {

    private double length;
    private Point3D start;
    private boolean initialised=false;

    public Cube(){
        start=new Point3D();
        length=5;
        initialised=true;
    }

    public Cube(Point3D x,double length){
        start=x;
        if(length>0)
            this.length=length;
        else
        this.length=5;
        initialised=true;
    }
    public Cube(double x,double y,double z,double length){;
        start=new Point3D(x,y,z);
        if(length>0)
            this.length=length;
        else
            this.length=0;
        initialised=true;
    }

    public double getLength(){
        return length;
    }

    public Point3D getCoordinates(){
        return start;
    }

    public void draw(){
        //
    }

    public boolean getState(){
        return initialised;
    }


    public String toString(){
        if(initialised)
            return "Cube has face coordinates at "+start+"and a length of "+length;
        else
            return "Cube not initialised;";

    }

}
