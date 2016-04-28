package shapes.shapes2D.triangle;

import shapes.shapes2D.base.Point;
import shapes.shapes3D.base.Point3D;
import shapes.shapes2D.Shape;

/**
 * Created by V3790148 on 4/26/2016.
 */
public class Triangle implements Shape {

    private Point one;
    private Point two;
    private Point three;
    private boolean initialised = false;


    public Triangle() {
        one = new Point(0, 0);
        two = new Point(5, 5);
        three = new Point(10, 10);
        initialised = true;


    }

    public Triangle(double x, double y, double z, double w, double u, double v) {
        if (x >= 0 && y >= 0) {
            //one.setCoordinates(x, y);
            one = new Point(x, y);
            if (z >= 0 && w >= 0 && (z != one.getX() || w != one.getY())) ;
            two = new Point(z, w);
            {
                if (u >= 0 && v >= 0 && (u != one.getX() || v != one.getY()) && (u != two.getX() || v != two.getY())) {
                    three = new Point(u, v);
                    initialised = true;

                }
            }
        }
    }

    public Triangle(Point a, Point b, Point c) {
        if (a.getX() > 0 && a.getY() > 0 && b.getX() > 0 && b.getY() > 0 && c.getY() > 0 && c.getX() > 0) {
            one = a;
            two = b;
            three = c;
            initialised = true;
        }
    }

    public Triangle(double base, double height) {
        if (base > 0 && height > 0) {
            one = new Point(0, 0);
            two = new Point(0, height);
            three = new Point(height, base);
            initialised = true;
        }
    }

    public void setCoordinates(double x, double y, double z, double w, double u, double v) {
        if (initialised) {
            if (x >= 0 && y >= 0) {
                one.setCoordinates(x, y);
                if (z >= 0 && w >= 0 && (z != one.getX() || w != one.getY())) ;
                two.setCoordinates(z, w);
                {
                    if (u >= 0 && v >= 0 && (u != one.getX() || v != one.getY()) && (u != two.getX() || v != two.getY())) {
                        three.setCoordinates(u, v);
                        initialised = true;
                    }
                }
            }
        }
    }

    public void setCoordinates(Point a, Point b, Point c) {
        if (initialised) {
            if (a.getX() > 0 && a.getY() > 0 && b.getX() > 0 && b.getY() > 0 && c.getY() > 0 && c.getX() > 0) {
                one = a;
                two = b;
                three = c;
                initialised = true;
            }
        }
    }

    public Point getA() {
        if (initialised)
            return one;
        else
            return new Point();
    }

    public Point getB() {
        if (initialised)
            return two;
        else
            return new Point();

    }

    public Point getC() {
        if (initialised)
            return three;
        else
            return new Point();

    }

    public void setSize(double base, double height) {
        if (initialised) {
            if (base > 0 && height > 0) {
                two.setCoordinates(0, height);
                three.setCoordinates(height, base);
                initialised = true;
            }
        }
    }

    public boolean getState() {
        return initialised;
    }

    public void draw() {
        //
    }

    public String toString() {
        if (initialised)
            return ("Triangle is at coordinates [(" + one.getX() + "," + one.getY() + "),(" + two.getX() + "," + two.getY() + "),(" + three.getX() + "," + three.getY() + ")]");
        else return "triangle not initialised";
    }
}


