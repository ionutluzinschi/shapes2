package shapes.shapes3D.cuboids;

import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cuboid extends Cuboids {

    private double width;
    private double height;

    public Cuboid(){
        upperLeft=new Point3D();
        length=5;
        width=5;
        height=5;
        initialised=true;
        name="Cuboid";
    }
    public Cuboid(String name){
        this.name=name;
        upperLeft=new Point3D();
        length=5;
        width=5;
        height=5;
        initialised=true;
    }

    public Cuboid(Point3D upperLeft, double length, double width,double height) {
        if (upperLeft.getZ() > 0 && upperLeft.getY() > 0 && upperLeft.getX() > 0 && width > 0 && length > 0 && height > 0) {
            name = "Cuboid";
            this.upperLeft = upperLeft;
            this.length = length;
            this.width = width;
            this.height = height;
            initialised = true;
        }
    }
    public Cuboid(Point3D upperLeft, double length, double width,double height,String name) {
        if (upperLeft.getZ() > 0 && upperLeft.getY() > 0 && upperLeft.getX() > 0 && width > 0 && length > 0 && height > 0) {
            this.name = name;
            this.upperLeft = upperLeft;
            this.length = length;
            this.width = width;
            this.height = height;
            initialised = true;
        }
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    public void setLength(double length){
        if(length>0)
            this.length=length;
    }
    public void setWidth(double width){
        if(width>0)
            this.width=width;
    }
    public void setHeight(double height){
        if(height>0){
            this.height=height;
        }
    }

    public String toString(){
        if(initialised)
            return name+"["+upperLeft+ " "+length+", "+height+" ,"+width+"]";
        return "Square not initialised";
    }

}
