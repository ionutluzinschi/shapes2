package shapes.shapes2D.triangle;

import shapes.shapes2D.base.Point;
import shapes.Shape;
import shapes.shapes2D.triangle.triangleMath.TriangleCalculator;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Triangle extends Shape {
    private String name="Triangle";
    private Point A;
    private Point B;
    private Point C;
    private double cathetusA;
    private double cathetusB;
    private double diagonal;
    private TriangleCalculator myTCalculator;




    public Triangle() {
        A = new Point(3, 3);
        B = new Point(7, 7);
        C = new Point(10, 3);
        this.initialised = true;
        myTCalculator=new TriangleCalculator(this);

    }

    public Triangle(String name) {
        this.name=name;
        A = new Point(3, 3);
        B = new Point(7, 7);
        C = new Point(10, 3);
        this.initialised = true;
        myTCalculator=new TriangleCalculator(this);

    }

    public Triangle(Point a, Point b, Point c) {
        if (a.compareTo(new Point(0))>=0 && b.compareTo(new Point(0))>= 0 && c.compareTo(new Point(0)) >= 0 && a.compareTo(b)!=0 && b.compareTo(c)!=0 && a.compareTo(c)!=0 &&
                (a.getX()!=b.getX() || a.getX()!=c.getX() || c.getX()!=b.getX()) && (a.getY()!=b.getY()||a.getY()!=b.getY()||a.getY()!=c.getY())) {
            A = a;
            B = b;
            C = c;
            this.initialised = true;
            myTCalculator=new TriangleCalculator(this);
        }
    }
    public Triangle(Point a, Point b, Point c,String name) {
        this.name=name;
        if (a.compareTo(new Point(0))>=0 && b.compareTo(new Point(0))>= 0 && c.compareTo(new Point(0)) >= 0 && a.compareTo(b)!=0 && b.compareTo(c)!=0 && a.compareTo(c)!=0 &&
                (a.getX()!=b.getX() || a.getX()!=c.getX() || c.getX()!=b.getX()) && (a.getY()!=b.getY()||a.getY()!=b.getY()||a.getY()!=c.getY())) {
            A = a;
            B = b;
            C = c;
            this.initialised = true;
            myTCalculator=new TriangleCalculator(this);
        }
    }

    @Override
    public void setName(String name){
        if(this.initialised)
            this.name=name;
    }
    @Override
    public String getName(){
        return name;
    }


    public void setCoordinates(Point a, Point b, Point c) {
        if (this.initialised) {
            if (a.getX() > 0 && a.getY() > 0 && b.getX() > 0 && b.getY() > 0 && c.getY() > 0 && c.getX() > 0) {
                A = a;
                B = b;
                C = c;
            }
        }
    }

    public void setA(Point A){
        this.A=A;

    }
    public void setB(Point B){
        this.B=B;

    }
    public void setC(Point C){
        this.C=C;
    }

    public Point getA() {
        if (this.initialised)
            return A;
        else
            return new Point(0);
    }

    public Point getB() {
        if (this.initialised)
            return B;
        else
            return new Point(0);

    }
    public Point getC() {
        if (this.initialised)
            return C;
        else
            return new Point(0);

    }
    public double getCathetusA(){
        return cathetusA;
    }
    public double getCathetusB(){
        return cathetusB;
    }
    public double getDiagonal(){
        return diagonal;
    }
    public void setCathetusA(double sideA){
        cathetusA=sideA;
    }
    public void setCathetusB(double sideB){
        cathetusB=sideB;
    }
    public void setDiagonal(double sideC){
        diagonal=sideC;
    }

    public double getArea(){
        return myTCalculator.getArea();
    }
    @Override
    public boolean getState() {
        return initialised;
    }
    @Override
    public void draw() {
        System.out.println(this.toString());
               //
    }
    @Override
    public String toString() {
        if (initialised)
            return name+":[(" + A.getX() + "," + A.getY() + "),(" + B.getX() + "," + B.getY() + "),(" + C.getX() + "," + C.getY() + ")]";

        else return "triangle not initialised";
    }
}


