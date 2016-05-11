package shapes.visitorPattern;

import shapes.Shape;
import shapes.shapes2D.rectangle.Polygon;
import shapes.shapes2D.rectangle.Rectangle;
import shapes.shapes2D.rectangle.Square;
import shapes.shapes2D.round.Circle;
import shapes.shapes2D.triangle.Triangle;
import shapes.shapes3D.cuboids.Cube;
import shapes.shapes3D.cuboids.Cuboid;

import shapes.shapes3D.round3D.Cone;
import shapes.shapes3D.round3D.Cylinder;
import shapes.shapes3D.round3D.Sphere;


import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by v3790148 on 5/9/2016.
 */
public class XmlVisitor implements Visitor {
    List<Shape> list=new ArrayList<Shape>();
    XMLEncoder encoder;
    private String serialized_string;
    private OutputStream os;
    public XmlVisitor(String SERIALIZED_FILE_NAME){
        serialized_string=SERIALIZED_FILE_NAME;
        try{
            os=new BufferedOutputStream(new FileOutputStream(SERIALIZED_FILE_NAME));
            encoder=new XMLEncoder(os);
        }
        catch(FileNotFoundException e){}

    }
    public void visit(Drawing drawing){    }
    public void visit(Shape shape){    }
    public void visit(Square square){ list.add(square);
        }
    public void visit(Circle circle){
        list.add(circle);

    }
    public void visit(Triangle triangle){
        list.add(triangle);
    }
    public void visit(Rectangle rectangle){
        list.add(rectangle);
    }

    public void visit(Polygon polygon){
        list.add(polygon);
    }

    public void visit(Cube cube){
        list.add(cube);
    }
    public void visit(Cuboid cuboid){
        list.add(cuboid);
    }

    public void visit(Cone cone){
        list.add(cone);
    }
    public void visit(Cylinder cylinder){ list.add(cylinder);    }
    public void visit(Sphere sphere){ list.add(sphere);   }

    public void encode(){ encoder.writeObject(list);
    }
    public void closeEncoder(){encoder.close();}

}
