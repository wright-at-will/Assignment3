package Commands;

public class DrawList implements Command {


    public Command execute() {
        return new Undo() {
            @Override
            public Command execute() {
                return null;
            }
        };
    }
}
