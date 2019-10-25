package Commands;

import Canvas.DrawCanvas;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;

public class Create extends Command {
    Shape createdShape;

    public Create(DrawCanvas canvas, String ... params){
        super(canvas);
        try{
            if(params[0].equals("RECTANGLE")){
                createdShape = new Rectangle(params[1],params[2]);
            } else if(params[0].equals("CIRCLE")){
                createdShape = new Circle(params[1]);
            } else
                throw new CommandException("Invalid shape");
        } catch (CommandException e){
            System.err.println(e.toString());
        } catch (IndexOutOfBoundsException e){
            System.err.println("invalid shape parameters");
        }
    }
    public void execute() {
        canvas.add(createdShape);
    }

    public void undo(){
        canvas.remove();
    }
}
