package shapes.shapes3D.base;

import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Point3D{
    private Point xY;
    private double z;
    private boolean initialised=false;

    public Point3D(){
        xY=new Point();
        z=0;
        initialised=true;
    }
    public Point3D(Point x,double z){
        xY=x;
        if(z>=0)
            this.z=z;
        else
            z=0;
        initialised=true;
    }

    public Point3D(double x, double y, double z){
        xY=new Point(x,y);
            if(z>0)
                this.z=z;
            else this.z=0;
        }

    public void setCoordinates(double x, double y, double z){
        if(initialised ){
            xY=new Point(x,y);
            if(z>0)
                this.z=z;
            else this.z=0;
        }
    }
    public void setCoordinates(Point x, double z) {
        if (initialised) {
            xY = x;
            if (z > 0)
                this.z = z;
            else this.z = 0;

        }
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

    public boolean getState(){
        return initialised;
    }
    public void draw(){

    }
    public String toString(){
        if(initialised){
            return "("+xY.getX()+","+xY.getY()+","+z+")";
        }
        else
            return "Point not initialised";
    }

    }


