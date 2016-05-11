package shapes.shapes2D.triangle;


import shapes.visitorPattern.Visitor;
import shapes.Exceptions.InvalidCoordinates;

import shapes.shapes2D.Shapes2D;
import shapes.shapes2D.base.Point;
import shapes.Shape;



/**
 * Created by V3790148 on 4/26/2016.
 */
public class Triangle extends Shapes2D {

    private Point A;
    private Point B;
    private Point C;

    public Triangle() throws InvalidCoordinates {
        this.name="triangle";

            A = new Point(3, 3);
            B = new Point(7, 7);
            C = new Point(10, 3);

    }

    public Triangle(Point a, Point b, Point c) {
        if (a.compareTo(b)!=0 && b.compareTo(c)!=0 && a.compareTo(c)!=0 &&(a.getX()!=b.getX() || a.getX()!=c.getX() ||
                c.getX()!=b.getX()) && (a.getY()!=b.getY()||a.getY()!=b.getY()||a.getY()!=c.getY())) {
            A = a;
            B = b;
            C = c;
            this.name = "triangle";

        }
    }

    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }


    public void setCoordinates(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }

    public Point getA() { return A;    }

    public void setA(Point A){  this.A=A;    }

    public Point getB() { return B;    }

    public void setB(Point B){ this.B=B;    }

    public Point getC() { return C;    }

    public void setC(Point C){
        this.C=C;
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


