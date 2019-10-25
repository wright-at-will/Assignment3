package Commands;

import Canvas.DrawCanvas;

public class Color extends Command {

    private static final String colors[] = {"Red", "Blue", "Yellow", "Orange", "Green"};
    String newColor;
    String oldColor;
    Color(DrawCanvas canvas, String ... params) throws CommandException {
        super(canvas);
        if(params.length != 1)
            throw new CommandException("Invalid Color command: no color given");
        newColor = params[0];
    }
    public void execute() {
        oldColor = canvas.getSelected().color(newColor);
    }

    @Override
    public void undo() {
        canvas.getSelected().color(oldColor);
    }
}
