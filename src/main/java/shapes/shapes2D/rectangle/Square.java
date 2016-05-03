package shapes.shapes2D.rectangle;

import shapes.Shape;
import shapes.shapes2D.Shapes2D;
import shapes.shapes2D.base.Point;

/**
 * Created by V3790148 on 4/26/2016.
 */

    public class Square extends Rectangular {

        private String name="Square";



        public Square(){
            length=3;
            upperLeft=new Point(5,5);
            initialised=true;
        }
        public Square(String name){
        this.name=name;
        length=3;
        upperLeft=new Point(5,5);
        initialised=true;
    }
        public Square(double length){
            if(length>0) {
                this.length = length;
                upperLeft = new Point(0, 0);
                initialised = true;
            }
        }
        public Square(double length,String name){
            if(length>0) {
                this.name = name;
                this.length = length;
                upperLeft = new Point(0, 0);
                initialised = true;
            }
    }


        public Square(Point one, double length){
            if(one.getX()>=0 && one.getY()>=0 && length>0){
                upperLeft=one;
                this.length=length;
                initialised=true;
            }

        }
         public Square(Point one, double length,String name){
        if(one.getX()>=0 && one.getY()>=0 && length>0){
            this.name=name;
            upperLeft=one;
            this.length=length;
            initialised=true;
        }

    }
         public void setCoordinates(Point one) {
            if (initialised) {
                if (one.getX() >= 0 && one.getY() >= 0) {
                    upperLeft = one;

                }
            }
        }


        public String toString(){
            if (initialised)
                 return name+"[("+upperLeft.getX()+","+upperLeft.getY()+") "+length+"]";
            else
                return "Square not initialised";
        }


    }

