package shapes.shapes3D.cuboids;

import shapes.Shape;
import shapes.shapes2D.base.Point;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 4/27/2016.
 */
public class Cuboid extends Shape {

    private Point3D start;
    private double length;
    private double width;
    private double height;

    public Cuboid(){
        start=new Point3D();
        length=5;
        width=5;
        height=5;
        initialised=true;
        name="Cuboid";
    }
    public Cuboid(String name){
        this.name=name;
        start=new Point3D();
        length=5;
        width=5;
        height=5;
        initialised=true;
    }

    public Cuboid(Point3D start, double length, double width,double height) {
        if (start.getZ() > 0 && start.getY() > 0 && start.getX() > 0 && width > 0 && length > 0 && height > 0) {
            name = "Cuboid";
            this.start = start;
            this.length = length;
            this.width = width;
            this.height = height;
            initialised = true;
        }
    }
    public Cuboid(Point3D start, double length, double width,double height,String name) {
        if (start.getZ() > 0 && start.getY() > 0 && start.getX() > 0 && width > 0 && length > 0 && height > 0) {
            this.name = name;
            this.start = start;
            this.length = length;
            this.width = width;
            this.height = height;
            initialised = true;
        }
    }
    public Cuboid(double x,double y,double z, double length, double width,double height) {
        if (x >= 0 && y >= 0 && z >= 0 && length > 0 && width > 0 && height > 0) {
            start = new Point3D(x, y, z);
            name = "Cuboid";
            this.length = length;
            this.width = width;
            this.height = height;
            initialised = true;
        }
    }
    public Cuboid(double x,double y,double z, double length, double width,double height,String name){
        if (x >= 0 && y >= 0 && z >= 0 && length > 0 && width > 0 && height > 0) {
            start = new Point3D(x, y, z);
            this.name = name;
            this.length = length;
            this.width = width;
            this.height = height;
            initialised = true;
        }
    }

    public Point3D getCoordinates(){
        if(initialised)
            return start;
        else
            return new Point3D();
    }
    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setStart(Point3D x){
        start=x;
    }
    public  void setStart(double x,double y,double z){
        start=new Point3D(x,y,z);
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

    @Override
    public void draw(){

    }
    @Override
    public String toString(){
        if(initialised)
            return name+"["+start+ " "+length+", "+height+" ,"+width+"]";
        return "Square not initialised";
    }

}
