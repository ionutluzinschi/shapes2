package shapes.shapes3D.pyramids;

import shapes.Shape;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class SquarePyramid extends Pyramids {

    public SquarePyramid(){
        length=5;
        name="Square Pyramid";
        tip=new Point3D();
        base=new Point3D(5,5,5);
        initialised=true;
    }
    public SquarePyramid(String name){
        this.name=name;
        length=5;
        tip=new Point3D();
        base=new Point3D(5,5,5);
        initialised=true;
    }

    public SquarePyramid(Point3D tip,Point3D base,double length) {
        if (tip.getX() >= 0 && tip.getY() >= 0 && tip.getZ() >= 0 && length > 0 && base.getX()>0 &&base.getZ()>0 &&base.getY()>0) {
            name = "Square Pyramid";
            this.tip=tip;
            this.base=base;
            this.length = length;
            initialised = true;
        }
    }


    public SquarePyramid(Point3D tip,Point3D base,double length, String name){
        if (tip.getX() >= 0 && tip.getY() >= 0 && tip.getZ() >= 0 && length > 0 && base.getX()>0 &&base.getZ()>0 &&base.getY()>0) {
            this.name = name;
            this.tip=tip;
            this.base=base;
            this.length = length;
            initialised = true;
        }
    }




    @Override
    public void draw(){

    }
    @Override
    public String toString(){
        if(initialised){
            return name+":["+tip+" "+length+"]";
        }
        else
            return "square pyramid not initialised";
    }


}
