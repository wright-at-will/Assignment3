package Commands;

import Canvas.DrawCanvas;

public abstract class Command {

    DrawCanvas canvas;

    Command(DrawCanvas canvas){
        this.canvas = canvas;
    }

    abstract void execute();
    abstract void undo();
}
