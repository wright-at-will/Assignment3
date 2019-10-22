package Commands;

public class Color implements Command {

    public Command execute() {
        return new Color(){
            @Override
            public Command execute(){
                return null;
            }
        };
    }
}
