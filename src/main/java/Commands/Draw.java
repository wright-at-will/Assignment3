package Commands;

import Canvas.DrawCanvas;
import Shapes.Shape;

public class Draw extends Command {

    Shape selectedShape;

    Draw(DrawCanvas canvas){
        super(canvas);
    }

    @Override
    public void execute() {
        canvas.draw();
    }

    @Override
    public void undo() {

    }
}
