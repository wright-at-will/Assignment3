package Shapes;

public class Rectangle extends Shape {

    int h, w;
    public Rectangle(String h, String w){
        this.h = Integer.parseInt(h);
        this.w = Integer.parseInt(w);
        color = "Red";
    }

    @Override
    public void draw() {
        System.out.printf("Rectangle, Color: %s, Origin: (%d,%d), Width: %d, Height: %d\n", color, point.x, point.y, w, h);
    }
}
