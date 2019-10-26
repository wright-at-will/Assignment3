package Canvas;

import Commands.Command;
import Shapes.Shape;

import java.util.ArrayList;
import java.util.Stack;

public class DrawCanvas {

    private ArrayList<Shape> shapes;
    private int select;

    public DrawCanvas(){
        shapes = new ArrayList<>();
    }

    public void add(Shape shape){
        shapes.add(shape);
    }

    public void add(Shape shape, int location){
        shapes.add(location, shape);
    }

    public Shape getSelected(){
        return shapes.get(select);
    }
    public int getSelect(){ return select;}

    public int setSelected(int shape){
        if(shape > shapes.size()) {
            System.err.println("Error: Invalid Shape for Select");
            return select;
        }
        int oldSelect = select;
        select = shape-1;
        return oldSelect;
    }

    public void drawScene(){
        for(Shape shape: shapes){
            shape.draw();
        }
    }

    public void draw(){
        shapes.get(select).draw();
    }

    public Shape remove(){
        return shapes.remove(select);
    }
}
