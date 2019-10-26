package Commands;

import Canvas.DrawCanvas;
import java.util.Stack;

public class CommandBuilder {

    Stack<Command> commands;
    DrawCanvas canvas;
    public CommandBuilder(DrawCanvas canvas, Stack commands){
        this.canvas = canvas;
        this.commands = commands;
    }

    public void createCommand(String command, String ... params){
        boolean didUndo = false;
        CommandName commandName = CommandName.valueOf(command);
        try{
            switch (commandName){
                case COLOR:
                    commands.push(new Color(canvas, params));
                    break;
                case CREATE:
                    commands.push(new Create(canvas, params));
                    break;
                case DELETE:
                    commands.push(new Delete(canvas));
                    break;
                case DRAW:
                    commands.push(new Draw(canvas));
                    break;
                case DRAWSCENE:
                    commands.push(new DrawScene(canvas));
                    break;
                case MOVE:
                    commands.push(new Move(canvas, params));
                    break;
                case SELECT:
                    commands.push(new Select(canvas, params[0]));
                    break;
                case UNDO:
                    didUndo = true;
                    Command undoCommand = commands.pop();
                    undoCommand.undo();
                    break;
            }
            if (!didUndo)
                commands.peek().execute();
        } catch (CommandException e){
            System.err.println(e);
        }
    }

}
