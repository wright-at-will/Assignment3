package Commands;

public class Draw implements Command {

    public Command execute() {
        return new Undo() {
            @Override
            public Command execute() {
                return null;
            }
        };
    }
}
