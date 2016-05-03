package shapes.shape3DFactory;

import shapes.Shape;
import shapes.shapes3D.round3D.Cone;
import shapes.shapes3D.round3D.Cylinder;
import shapes.shapes3D.round3D.Sphere;
import shapes.shapes3D.cuboids.Cube;
import shapes.shapes3D.cuboids.Cuboid;
import shapes.shapes3D.pyramids.Pyramid;
import shapes.shapes3D.pyramids.SquarePyramid;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class Shape3DFactory {
    public Shape get3DShape(String shapeType){
        if(shapeType==null)
            return null;
        if(shapeType.equalsIgnoreCase("Cuboid"))
            return new Cuboid();
        else if(shapeType.equalsIgnoreCase("Pyramid"))
            return new Pyramid();
        else if(shapeType.equalsIgnoreCase("Square Pyramid"))
            return new SquarePyramid();
        else if(shapeType.equalsIgnoreCase("Cylinder"))
            return new Cylinder();
        else if(shapeType.equalsIgnoreCase("Sphere"))
            return new Sphere();
        else if(shapeType.equalsIgnoreCase("Cone"))
            return new Cone();
        else if(shapeType.equalsIgnoreCase("Cube"))
        return new Cube();
        return null;


    }
}
