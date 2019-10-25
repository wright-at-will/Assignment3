package Commands;

public class CommandException extends Throwable{

    private StringBuilder exception;

    public CommandException(String exception){
        this.exception.append(exception);
    }

    public void addException(String Exception){
        exception.append("\n"+Exception);
    }

    @Override
    public String toString(){
        return exception.toString();
    }
}
