package Canvas;

import Commands.Command;
import Commands.CommandBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class Interpreter {

    BufferedReader reader;
    DrawCanvas canvas;
    Stack<Command> commands;
    public Interpreter(BufferedReader reader, DrawCanvas canvas){
        this.reader = reader;
        this.canvas = canvas;
        commands = new Stack<>();
    }

    public void executeCommands() throws IOException {
        String[] command;
        String commandString;
        CommandBuilder builder = new CommandBuilder(canvas, commands);
        while((commandString = reader.readLine()) != null){
            command = commandString.split(" ");
            builder.createCommand(command[0], Arrays.copyOfRange(command, 1, command.length));
        }
    }
}
