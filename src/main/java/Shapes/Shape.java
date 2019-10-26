package Shapes;

import java.awt.*;

public abstract class Shape {
    Point point;
    String color;

    public Shape(){
        point = new Point();
        color = "no color";
    }

    public abstract void draw();

    public Point Move(Point point){
        Point oldPoint = point;
        this.point = point;
        return oldPoint;
    }

    public String color(String newColor){
        String oldColor = color;
        color = newColor;
        return oldColor;
    }

}
