package shapes.shapes3D.pyramids;

import shapes.shapes3D.Shapes3D;
import shapes.shapes3D.base.Point3D;

/**
 * Created by V3790148 on 5/3/2016.
 */
public abstract class Pyramids extends Shapes3D {
    protected double length;
    protected Point3D tip;
    protected Point3D base;

    public void setLength(double length){
        if(initialised && length>0)
            this.length=length;
    }
    public void setTip(Point3D tip){
        if(initialised && tip.getX() >= 0 && tip.getY() >= 0 && tip.getZ() >= 0)
            this.tip=tip;
    }
    public void setBase(Point3D base){
        if(initialised && base.getY()>0 && base.getZ()>0 && base.getX()>0)
            this.base=base;
    }
    public double getLength(){
        return length;
    }
    public Point3D getTip(){
        return tip;

    }
    public Point3D getBase(){
        return base;
    }


}
