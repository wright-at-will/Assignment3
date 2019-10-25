package Commands;

import Canvas.DrawCanvas;

public class Select extends Command {

    int selection;
    Select(DrawCanvas canvas, String selection) throws  CommandException{
        super(canvas);
        this.selection = Integer.parseInt(selection);
    }

    @Override
    public void execute() {
        selection = canvas.setSelected(selection);
    }

    @Override
    public void undo() {
        canvas.setSelected(selection);
    }
}
