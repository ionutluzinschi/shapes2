package shapes.shapes2D.triangle.triangleMath;

import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 5/3/2016.
 */
public class Swapper {
    private double x;
    private double y;
    private Point A;
    private Point B;

    public Swapper(double x,double y){
        this.x=y;
        this.y=x;
    }
    public Swapper(Point A, Point B) {
        this.A = B;
        this.B = A;
    }
    public void Swap(Point A, Point B) {
        this.A = B;
        this.B = A;
    }
    public void Swap(double x,double y){
        this.x=y;
        this.y=x;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public Point getA(){
        return A;
    }
    public Point getB(){
        return B;
    }
}
