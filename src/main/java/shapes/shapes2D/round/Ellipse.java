package shapes.shapes2D.round;

import shapes.Exceptions.InvalidCoordinates;
import shapes.Exceptions.InvalidRadius;
import shapes.Exceptions.NullObject;
import shapes.Exceptions.OutOfBounds;
import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.visitorPattern.Visitor;


/**
 * Created by V3790148 on 4/26/2016.
 */
public class Ellipse extends Round {
    private Point centerB;

    public Ellipse() {
        try {
            center = new Point(2, 2);
            centerB = new Point(2, 6);
        } catch (InvalidCoordinates e) {
        }
        radius = 5;
        initialised = true;
        name = "Ellipse";
    }

    public Ellipse(String name) {
        this.name = name;
        try {
            center = new Point(2, 2);
            centerB = new Point(2, 6);
        } catch (InvalidCoordinates e) {
        }
        radius = 5;
        initialised = true;
    }

    public Ellipse(Point x, Point y) {
        center = x;
        centerB = y;
        radius = Math.abs(center.getY() - centerB.getY()) + 1;
        name = "Ellipse";
    }

    public Ellipse(Point x, Point y, String name) {
        this.name = name;
        center = x;
        centerB = y;
        radius = Math.abs(center.getY() - centerB.getY()) + 1;
    }


    public Ellipse(Point x, Point y, double radius) throws InvalidRadius, OutOfBounds {
        if (radius <= 0)
            throw new InvalidRadius(radius);
        name = "Ellipse";
        center = x;
        centerB = y;
        if (radius > center.getX() + centerB.getX() || radius > centerB.getY() + center.getY())
            throw new OutOfBounds(radius, x, y);
        this.radius = radius;
        initialised = true;

    }

    public Ellipse(Point x, Point y, double radius, String name) throws InvalidRadius, OutOfBounds {
        if (radius > center.getX() + centerB.getX() || radius > centerB.getY() + center.getY())
            throw new OutOfBounds(radius, x, y);
        if (radius <= 0)
            throw new InvalidRadius(radius);
        this.name = name;
        center = x;
        centerB = y;
        if (radius > 0)
            this.radius = radius;
        else
            this.radius = 5;
        initialised = true;
    }
    public void accept( Visitor partsVisitor){
        partsVisitor.visit(this);
    }


    public void setCenters(Point x, Point y) throws NullObject {
        if (this.equals(null))
            throw new NullObject();
        center = x;
        centerB = y;
    }

    public Point getCenterB() {
        return centerB;
    }

    public void setCenterB(Point x) throws NullObject {
        if (this.equals(null))
            throw new NullObject();
        centerB = x;
    }


    public void draw() {
        System.out.println("Drawing " + name + ", with points at " + center + " " + centerB);
        if (getSubShapes().size() > 0) {
            System.out.println("Drawing subshapes: ");
            for (Shape sh : getSubShapes()) {
                sh.draw();
            }
            System.out.println("Finished drawing subshapes for " + name);
        }
    }

    public String toString() {
        return name + ":[(" + center + "," + centerB + ") " + radius + "]";
    }
}


