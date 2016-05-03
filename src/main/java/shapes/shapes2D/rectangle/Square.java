package shapes.shapes2D.rectangle;

import shapes.Shape;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */

    public class Square extends Shape {

        private String name="Square";
        private double length;
        private Point start;


        public Square(){
            length=3;
            start=new Point(5,5);
            initialised=true;
        }
        public Square(String name){
        this.name=name;
        length=3;
        start=new Point(5,5);
        initialised=true;
    }
        public Square(double length){
            if(length>0) {
                this.length = length;
                start = new Point(0, 0);
                initialised = true;
            }
        }
        public Square(double length,String name){
            if(length>0) {
                this.name = name;
                this.length = length;
                start = new Point(0, 0);
                initialised = true;
            }
    }


        public Square(Point one, double length){
            if(one.getX()>=0 && one.getY()>=0 && length>0){
                start=one;
                this.length=length;
                initialised=true;
            }

        }
         public Square(Point one, double length,String name){
        if(one.getX()>=0 && one.getY()>=0 && length>0){
            this.name=name;
            start=one;
            this.length=length;
            initialised=true;
        }

    }

    public void setCoordinates(Point one) {
            if (initialised) {
                if (one.getX() >= 0 && one.getY() >= 0) {
                    start = one;

                }
            }
        }

        public Point getCoordinates(){
            if(initialised)
                return start;
            else
                return new Point();
    }
        public void setLength(double length) {
            if (initialised) {
                if (length > 0)
                    this.length = length;
            }
        }
        public double getLength(){
            if(initialised)
                return length;
            else
                return 0;
        }
        @Override
        public void draw(){
            System.out.println("Square: length= "+length+" starts at "+start);

        }

        @Override
        public String toString(){
            if (initialised)
                 return name+"[("+start.getX()+","+start.getY()+") "+length+"]";
            else
                return "Square not initialised";
        }


    }

