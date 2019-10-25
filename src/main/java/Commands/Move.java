package Commands;

import Canvas.DrawCanvas;
import Shapes.Shape;

import java.awt.*;

public class Move extends Command {

    Shape selectedShape;
    Point point;

    public Move(DrawCanvas canvas, String ... params) throws CommandException{
        super(canvas);
        point = new Point(Integer.parseInt(params[0]),Integer.parseInt(params[1]));
    }

    @Override
    public void execute() {
        point = canvas.getSelected().Move(point);
    }

    @Override
    public void undo() {
        canvas.getSelected().Move(point);
    }
}
