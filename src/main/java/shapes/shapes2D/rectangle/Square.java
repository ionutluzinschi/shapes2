package shapes.shapes2D.rectangle;

import shapes.shapes2D.Shape;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */

    public class Square implements Shape {

        private double length;
        private Point start;
        private boolean initialised=false;

        public Square(){
            length=1;
            start=new Point(0,0);
            initialised=true;
        }

        public Square(double x, double y,double length){
            if(x>=0 && y>=0 && length>=0)
            {
                start=new Point(x,y);
                this.length=length;
                initialised=true;
            }
        }
        public Square(Point one, double length){
            if(one.getX()>=0 && one.getY()>=0 && length>0){
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

        public void draw(){

        }
        public boolean getState(){
            return initialised;
    }

        public String toString(){
            if (initialised)
                 return "Square starts at ("+start.getX()+","+start.getY()+") and has a length of "+length;
            else
                return "Square not initialised";
        }


    }

