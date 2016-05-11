package shapes.shapes2D.rectangle;

import shapes.Exceptions.InvalidCoordinates;
import shapes.Exceptions.InvalidValue;
import shapes.Shape;
import shapes.shapes2D.base.Point;

import shapes.visitorPattern.Visitor;

/**
 * Created by V3790148 on 4/26/2016.
 */

    public class Square extends Rectangular {

        public Square() throws InvalidCoordinates {
            this.name = "square";
            length = 3;
            upperLeft = new Point(5, 5);
        }

        public Square(Point one, double length) throws InvalidValue{
            this.name="square";
            if(length<0)
               throw new InvalidValue(length);
            upperLeft=one;
            this.length=length;

        }

        public void accept( Visitor partsVisitor){
             partsVisitor.visit(this);
        }

        public void setCoordinates(Point one){
            upperLeft = one;
        }
        public void draw() {
            System.out.println("Drawing " + name + " with a length of " + length);
            if (getSubShapes().size() > 0) {
                System.out.println("Drawing subshapes: ");
                for (Shape sh : getSubShapes()) {
                    sh.draw();
                }
                System.out.println("Finished drawing subshapes for "+name);
            }
        }
        public String toString(){
                 return name+"[("+upperLeft.getX()+","+upperLeft.getY()+") "+length+"]";
        }
    }

