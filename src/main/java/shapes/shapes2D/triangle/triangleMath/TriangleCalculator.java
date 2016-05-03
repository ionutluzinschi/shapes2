package shapes.shapes2D.triangle.triangleMath;

import shapes.shapes2D.base.Point;
import shapes.shapes2D.triangle.Triangle;

/**
 * Created by V3790148 on 5/3/2016.
 */
public class TriangleCalculator {
    Triangle myTriangle;
    public TriangleCalculator(Triangle myTriangle){
        this.myTriangle=myTriangle;
        myTriangle.setCathetusA(getPythagora(myTriangle.getA(),myTriangle.getB()));
        myTriangle.setCathetusB(getPythagora(myTriangle.getB(),myTriangle.getC()));
        myTriangle.setDiagonal(getPythagora(myTriangle.getA(),myTriangle.getC()));
        orderSides();

    }

    public void changedState(){
        orderSides();
    }
    private void orderSides(){
              if(myTriangle.getCathetusA()>myTriangle.getDiagonal()){
            Swapper swap=new Swapper(myTriangle.getCathetusA(),myTriangle.getDiagonal());
            myTriangle.setCathetusA(swap.getX());
            myTriangle.setDiagonal(swap.getY());
            swap.Swap(myTriangle.getA(),myTriangle.getC());
            myTriangle.setA(swap.getA());
            myTriangle.setC(swap.getB());
        }
        if(myTriangle.getCathetusB()>myTriangle.getDiagonal()){
            Swapper swap=new Swapper(myTriangle.getCathetusB(),myTriangle.getDiagonal());
            myTriangle.setCathetusB(swap.getX());
            myTriangle.setDiagonal(swap.getY());
            swap.Swap(myTriangle.getB(),myTriangle.getC());
            myTriangle.setB(swap.getA());
            myTriangle.setC(swap.getB());
        }
        if(myTriangle.getCathetusA()>myTriangle.getCathetusB()){
            Swapper swap=new Swapper(myTriangle.getCathetusA(),myTriangle.getCathetusB());
            myTriangle.setCathetusA(swap.getX());
            myTriangle.setCathetusB(swap.getY());
            swap.Swap(myTriangle.getA(),myTriangle.getB());
            myTriangle.setA(swap.getA());
            myTriangle.setB(swap.getB());
        }
    }
    public double getPythagora(Point A, Point B){
        return Math.sqrt(Math.pow(Math.abs(A.getX()-B.getX()),2)+Math.pow(Math.abs(A.getY()-B.getY()),2));
    }


    public boolean isRightAngle(){
        if((Math.pow(myTriangle.getCathetusA(),2)+Math.pow(myTriangle.getCathetusB(),2))==Math.pow(myTriangle.getDiagonal(),2))
            return true;
        else
            return false;
    }

    public double getArea(){
        if(this.isRightAngle())
            return myTriangle.getCathetusA()*myTriangle.getCathetusB()/2;
        else
            return myTriangle.getCathetusA()*getPythagora(myTriangle.getB(),myTriangle.getC())/2;
    }

}
