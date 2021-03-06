package shapes;

import shapes.shapes2D.rectangle.Polygon;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.triangle.Triangle;
import shapes.shapes3D.round3D.Cone;
import shapes.shapes3D.round3D.Cylinder;
import shapes.shapes3D.round3D.Sphere;
import shapes.shapes3D.cuboids.Cube;
import shapes.shapes3D.cuboids.Cuboid;

/**
 * Created by v3790148 on 4/28/2016.
 */
public abstract class AreaCalculator {
    public static double calculateArea(Shape shape){
        if(shape==null)
            return -1;
        if(shape instanceof Square)
            return ((Square) shape).getLength()*((Square) shape).getLength();
        else if(shape instanceof Rectangle)
            return  ((Rectangle) shape).getLength()*((Rectangle) shape).getWidth();

        else if(shape instanceof Polygon)
            return 1;
         else if(shape instanceof Circle)
            return 2*Math.PI*((Circle) shape).getRadius();
        else if(shape instanceof Triangle)
            return Math.abs((((Triangle) shape).getA().getX()*(((Triangle) shape).getB().getY()-((Triangle) shape).getC().getY())+
                    ((Triangle) shape).getB().getX()*(((Triangle) shape).getC().getY()-((Triangle) shape).getA().getY())+
                    ((Triangle) shape).getC().getX()*(((Triangle) shape).getA().getY()-((Triangle) shape).getB().getY()))/2);
        else if(shape instanceof Cube)
            return ((Cube) shape).getLength()*6;
        else if(shape instanceof Cuboid)
            return ((Cuboid) shape).getLength()*((Cuboid) shape).getHeight()*((Cuboid) shape).getWidth()*2;
        else if(shape instanceof Sphere)
            return 4*Math.PI*((Sphere) shape).getRadius();
        else if(shape instanceof Cylinder)
            return 2*Math.PI*((Cylinder) shape).getRadius()*(((Cylinder) shape).getRadius()+((Cylinder) shape).getHeight());
        else if(shape instanceof Cone)
            return Math.PI*((Cone) shape).getRadius()*(((Cone) shape).getRadius()+Math.sqrt((Math.pow(((Cone) shape).getRadius(),2)+Math.pow(((Cone) shape).getHeight(),2))));

        return -1;

    }
}
