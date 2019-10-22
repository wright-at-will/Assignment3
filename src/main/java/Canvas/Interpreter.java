package Canvas;

import java.io.BufferedReader;
import java.io.IOException;

public class Interpreter {

    BufferedReader reader;
    public Interpreter(BufferedReader reader){
        this.reader = reader;
    }

    public void executeCommands() throws IOException {
        String command;
        while((command = reader.readLine()) != null){
            System.out.println(command);
        }
    }
}
