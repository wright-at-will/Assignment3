package Commands;

import Canvas.DrawCanvas;
import java.awt.*;

public class Move extends Command {

    Point point;
    Point oldPoint;

    public Move(DrawCanvas canvas, String ... params) throws CommandException{
        super(canvas);
        point = new Point(Integer.parseInt(params[0]),Integer.parseInt(params[1]));
    }

    @Override
    public void execute() {
        oldPoint = canvas.getSelected().Move(point);
    }

    @Override
    public void undo() {
        canvas.getSelected().Move(oldPoint);
    }
}
