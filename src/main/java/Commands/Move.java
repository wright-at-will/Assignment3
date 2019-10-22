package Commands;

public class Move implements Command {


    public Command execute() {
        return new Undo() {
            @Override
            public Command execute() {
                return null;
            }
        };
    }
}
