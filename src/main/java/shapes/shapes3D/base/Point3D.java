package shapes.shapes3D.base;

import org.omg.CORBA.DynAnyPackage.Invalid;
import shapes.Exceptions.Invalid3DCoordinates;
import shapes.Exceptions.InvalidCoordinates;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Point3D{
    private Point xY;
    private double z;


    public Point3D(){
        try{
        xY=new Point(0,0);}
        catch(InvalidCoordinates e) {}
        z=0;

    }
    public Point3D(Point x,double z) throws Invalid3DCoordinates {
        if (z<0)
            throw new Invalid3DCoordinates(x.getX(),x.getY(),z);
        xY = x;
        this.z = z;
    }

    public Point3D(double x, double y, double z) throws Invalid3DCoordinates {
        if(z<0 || x<0 ||y<0)
            throw new Invalid3DCoordinates(x,y,z);
             try{ xY = new Point(x, y);}
             catch(InvalidCoordinates e) {}
                this.z = z;
    }

    public void setCoordinates(double x, double y, double z) throws Invalid3DCoordinates{
        if(z<0 || x<0 ||y<0)
            throw new Invalid3DCoordinates(x,y,z);
        try{ xY = new Point(x, y);}
        catch(InvalidCoordinates e) {}
        this.z = z;

        }

    public void setCoordinates(Point x, double z) throws Invalid3DCoordinates {
        if (z<0)
            throw new Invalid3DCoordinates(x.getX(),x.getY(),z);
        xY = x;
        this.z = z;
        }

     public double getZ(){
        return z;
    }

    public double getX(){
      return xY.getX();
   }

    public double getY(){
        return xY.getY();
    }

    public void draw(){

    }

    public String toString(){
        return "("+xY.getX()+","+xY.getY()+","+z+")";
    }

}

