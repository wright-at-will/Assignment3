package Shapes;

public class Rectangle extends Shape {

    int height, width;
    public Rectangle(String width, String height){
        this.height = Integer.parseInt(height);
        this.width = Integer.parseInt(width);
        color = "Red";
    }

    @Override
    public void draw() {
        System.out.printf("Rectangle, Color: %s, Origin: (%d,%d), Width: %d, Height: %d\n", color, point.x, point.y, width, height);
    }
}
