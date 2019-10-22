package Commands;

public class Delete implements Command{

    public Command execute() {
        return new Undo() {
            @Override
            public Command execute() {
                return null;
            }
        };
    }
}
