package shapes.shapes3D.pyramids;

import shapes.Exceptions.NullObject;
import shapes.shapes3D.Shapes3D;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 5/3/2016.
 */
public abstract class Pyramids extends Shapes3D {
    protected double length;
    protected Point3D tip;
    protected Point3D base;

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        if(initialised && length>0)
            this.length=length;
    }

    public Point3D getTip(){
        return tip;
    }

    public void setTip(Point3D tip) throws NullObject{
        if(this.equals(null))
            throw new NullObject();
        this.tip=tip;
    }

    public Point3D getBase(){
        return base;
    }

    public void setBase(Point3D base) throws NullObject{
        if(this.equals(null))
            throw new NullObject();
            this.base=base;
    }
}
