package shapes.shapes2D.base;

import shapes.Shape;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Line{
    private Point[] points=new Point[2];
    public Line(){
    }

    public Line(Point x,Point y){
        points[0]=x;
        points[1]=y;
    }

    public void setEnd(Point x)
    {
        points[1]=x;
    }

    public Point getStart(){
        return points[0];
    }

    public void setStart(Point x){

        points[0]=x;
    }

    public Point getEnds(){
        return points[1];
    }


}
