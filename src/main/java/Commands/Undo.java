package Commands;

public class Undo implements Command {

    public Command execute() {
        return new Undo() {
            @Override
            public Command execute() {
                return null;
            }
        };
    }
}
