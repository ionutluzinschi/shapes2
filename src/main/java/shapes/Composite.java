package shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by v3790148 on 4/28/2016.
 */
public class Composite {

    private Shape myShape;
    private List<Composite> subShapes;

    public Composite(Shape sh){
        myShape=sh;
        subShapes=new ArrayList<Composite>();
    }

    public void addSubshape(Composite sh){
        subShapes.add(sh);
    }
    public void removeSubshapse(Composite sh){
        subShapes.remove(sh);
    }


    public List<Composite> getSubShapes(){
        return subShapes;
    }

    public void listAll(){
        for(Composite subs: this.getSubShapes()) {
            System.out.println(subs.myShape);
            subs.listAll();
        }
    }

    public void draw(){
       System.out.println(myShape);
    }



}

