package Commands;

import Canvas.DrawCanvas;

public class Draw extends Command {

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
