package Commands;

import Canvas.DrawCanvas;

public class Undo extends Command {

    Undo(DrawCanvas canvas, String ... params){
        super(canvas);
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
