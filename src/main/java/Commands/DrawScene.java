package Commands;

import Canvas.DrawCanvas;

public class DrawScene extends Command {

    public DrawScene(DrawCanvas canvas){
        super(canvas);
    }

    @Override
    public void execute() {
        canvas.drawScene();
    }

    @Override
    public void undo() {

    }
}
