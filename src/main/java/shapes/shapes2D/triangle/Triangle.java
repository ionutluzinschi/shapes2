package shapes.shapes2D.triangle;

import shapes.visitorPattern.Visitor;
import shapes.Exceptions.InvalidCoordinates;
import shapes.Exceptions.InvalidValue;
import shapes.Exceptions.NullObject;
import shapes.shapes2D.Shapes2D;
import shapes.shapes2D.base.Point;
import shapes.Shape;
import shapes.shapes2D.triangle.triangleMath.TriangleCalculator;


/**
 * Created by V3790148 on 4/26/2016.
 */
public class Triangle extends Shapes2D {

    private Point A;
    private Point B;
    private Point C;
    private double cathetusA;
    private double cathetusB;
    private double diagonal;
    private TriangleCalculator myTCalculator;

    public Triangle() {
        this.name="triangle";
        try {
            A = new Point(3, 3);
            B = new Point(7, 7);
            C = new Point(10, 3);
        }
        catch(InvalidCoordinates e)
        { }
        this.initialised = true;
        myTCalculator=new TriangleCalculator(this);

    }

    public Triangle(String name) {
        this.name=name;
        try {
            A = new Point(3, 3);
            B = new Point(7, 7);
            C = new Point(10, 3);
        } catch (InvalidCoordinates e) {}
        this.initialised = true;
        myTCalculator=new TriangleCalculator(this);

    }

    public Triangle(Point a, Point b, Point c) {
        if (a.compareTo(b)!=0 && b.compareTo(c)!=0 && a.compareTo(c)!=0 &&(a.getX()!=b.getX() || a.getX()!=c.getX() ||
                c.getX()!=b.getX()) && (a.getY()!=b.getY()||a.getY()!=b.getY()||a.getY()!=c.getY())) {
            A = a;
            B = b;
            C = c;
            this.name = "triangle";
            this.initialised = true;
            myTCalculator = new TriangleCalculator(this);
        }

        }

    public Triangle(Point a, Point b, Point c,String name){
        this.name=name;
        if (a.compareTo(b)!=0 && b.compareTo(c)!=0 && a.compareTo(c)!=0 &&(a.getX()!=b.getX() ||
                a.getX()!=c.getX() || c.getX()!=b.getX()) && (a.getY()!=b.getY()||a.getY()!=b.getY()||a.getY()!=c.getY())) {
            A = a;
            B = b;
            C = c;
            this.initialised = true;
            myTCalculator=new TriangleCalculator(this);
        }
    }
    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }


    public void setCoordinates(Point a, Point b, Point c) throws NullObject {
        if(this.equals(null))
            throw new NullObject();
            if (a.getX() > 0 && a.getY() > 0 && b.getX() > 0 && b.getY() > 0 && c.getY() > 0 && c.getX() > 0) {
                A = a;
                B = b;
                C = c;
            }
        }

    public Point getA() { return A;
    }

    public void setA(Point A){
        this.A=A;

    }

    public Point getB() { return B;

    }

    public void setB(Point B){ this.B=B;

    }

    public Point getC() { return C;
    }

    public void setC(Point C){
        this.C=C;
    }

    public double getCathetusA(){
        return cathetusA;
    }

    public void setCathetusA(double sideA) throws InvalidValue{
        if(sideA<=0)
            throw new InvalidValue(sideA);
        cathetusA=sideA;
    }

    public double getCathetusB(){
        return cathetusB;
    }

    public void setCathetusB(double sideB)throws InvalidValue{
        if(sideB<=0)
            throw new InvalidValue(sideB);
        cathetusB=sideB;}

    public double getDiagonal(){
        return diagonal;
    }

    public void setDiagonal(double sideC)throws InvalidValue{
        if(sideC<=0)
            throw new InvalidValue(sideC);
        diagonal=sideC;
    }

    public double getArea(){
        return myTCalculator.getArea();
    }


    public void draw(){
        System.out.println("Drawing "+name+" with an area of "+getArea());
        if(getSubShapes().size()>0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for "+name);
        }
    }

    public String toString() {
            return name+":[(" + A.getX() + "," + A.getY() + "),(" + B.getX() + "," + B.getY() + "),(" + C.getX() + "," + C.getY() + ")]";

    }
}


