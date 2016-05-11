package shapes.shapes3D.base;

import org.omg.CORBA.DynAnyPackage.Invalid;
import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Exceptions.InvalidCoordinates;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Point3D{
    private double x;
    private double z;
    private double y;


    public Point3D(){
        x=0;
        y=0;
        z=0;
    }

    public Point3D(double x, double y, double z) throws Invalid3DCoordinates {
        if(z<0 || x<0 ||y<0)
            throw new Invalid3DCoordinates(x,y,z);
        this.x=x;
        this.y=y;
        this.z = z;
    }

    public void setCoordinates(double x, double y, double z) throws Invalid3DCoordinates{
        if(z<0 || x<0 ||y<0)
            throw new Invalid3DCoordinates(x,y,z);
        this.x=x;
        this.y=y;
        this.z = z;
    }

     public double getZ(){ return z;   }

    public double getX(){  return x;   }

    public double getY(){  return y;   }

    public String toString(){
        return "("+x+","+y+","+z+")";
    }

}

