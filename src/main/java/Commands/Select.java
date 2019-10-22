package Commands;

public class Select implements Command {


    public Command execute() {
        return new Undo() {
            @Override
            public Command execute() {
                return null;
            }
        };
    }

}
