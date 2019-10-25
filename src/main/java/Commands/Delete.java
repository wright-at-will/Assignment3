package Commands;

import Canvas.DrawCanvas;
import Shapes.Shape;

public class Delete extends Command{
    Shape deletedShape;
    int shapeLocation;
    Delete(DrawCanvas canvas){
        super(canvas);
    }
    @Override
    public void execute() {
        shapeLocation = canvas.getSelect();
        deletedShape = canvas.remove();
    }

    @Override
    public void undo() {
        canvas.add(deletedShape, shapeLocation);
    }
}
