package shapes.shapes2D.base;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Line {
    private Point[] points=new Point[2];
    public Line(){
    }

    public Line(Point x,Point y){
        points[0]=x;
        points[1]=y;
    }

    public Line(double x,double y, double z, double w){
        if(x>=0 && y>=0 && z>=0 && w>=0){
            points[0].setCoordinates(x,y);
            points[1].setCoordinates(z,w);
        }
    }
    public void setStart(Point x){

        points[0]=x;
    }
    public void setEnd(Point x)
    {
        points[1]=x;
    }
    public Point getStart(){
        return points[0];
    }

    public Point getEnds(){
        return points[1];
    }
    public void draw(){

    }



}
