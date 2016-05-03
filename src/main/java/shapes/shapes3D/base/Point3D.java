package shapes.shapes3D.base;

import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Point3D{
    private Point xY;
    private double z;


    public Point3D(){
        xY=new Point();
        z=0;

    }
    public Point3D(Point x,double z) {
        if (x.getX() > 0 && xY.getY() > 0 && z>0) {
            xY = x;
            this.z = z;
        }
    }

    public Point3D(double x, double y, double z){
            if(z>0 && x>0 && y>0) {
                xY = new Point(x, y);
                this.z = z;
            }
        }

    public void setCoordinates(double x, double y, double z){
           if(x>0 &&y>0 && z>0) {
               xY = new Point(x, y);
               this.z = z;
           }

        }

    public void setCoordinates(Point x, double z) {
        if (x.getX()>0 && x.getY()>0 && z>0) {
            xY = x;
            this.z = z;
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

    public void draw(){

    }

    public String toString(){
        return "("+xY.getX()+","+xY.getY()+","+z+")";
    }

}

