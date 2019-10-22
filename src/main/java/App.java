import Canvas.Interpreter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
        System.out.println("Starting the project");
        BufferedReader reader = null;
        try {
            if(args.length != 1) {
                System.err.println("USAGE:  (Jar file) <FILENAME>");
                return;
            }
            reader = new BufferedReader(new FileReader(args[0]));
        } catch (FileNotFoundException e) {
            System.err.println("File not found: "+args[0]);
            return;
        }
        Interpreter interpreter = new Interpreter(reader);
    }
}
