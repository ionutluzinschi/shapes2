package shapes.shapes2D.base;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Point {
    private double x=0;
    private double y=0;

    public Point(double x,double y){
        if(x>=0 && y>=0) {
            this.x = x;
            this.y = y;
        }
    }
    public Point(){}

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        if(x>=0)
            this.x=x;
    }
    public void setY(double y){
        if(y>=0)
            this.y=y;
    }
    public void setCoordinates(double x,double y){
        if(x>=0 && y>=0) {
            this.x = x;
            this.y = y;
        }

    }
    public void draw(){
        //
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
