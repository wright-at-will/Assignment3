package Commands;

public class Create implements Command {

    public Command execute() {
        return new Color() {
            @Override
            public Command execute() {
                return null;
            }
        };


    }
}
