package Shapes;

public class Circle extends Shape {

    int r;
    public Circle(String r){
        this.r = Integer.parseInt(r);
        color = "Blue";
    }

    @Override
    public void draw() {
        System.out.printf("Circle, Color: %s, Origin: (%d,%d), Radius: %d\n", color, point.x, point.y, r);
    }
}
