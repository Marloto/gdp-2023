package lecture20230511.chapter07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.AlreadyBoundException;

class BadParametersException extends Exception {

    public BadParametersException() {
        super();
    }

    public BadParametersException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadParametersException(String message) {
        super(message);
    }

    public BadParametersException(Throwable cause) {
        super(cause);
    }
    
}

public class SecondExample {
    
    public static int calc(int a, int b) throws BadParametersException {
        if(a < 32 && b < 32) 
            return a + b;
        throw new BadParametersException("Message!");
    }

    public static void main(String[] args) {
        // Behandlung von Exceptions
        // -> throws
        // -> try-catch
        
//        calc(1 , 500);
        
//        doSomething();
        
        // bisher waren alles Checked-Exceptions
        // -> es gibt Unchecked-Exceptions!
        
        
//        new FileReader(new File("text.txt")); // <- abbruch wegen exception!
//        System.out.println("Hello, World!");
        
        try {

            throw new NullPointerException();
        } catch(OutOfMemoryError e) {
            // ...
        }
    }
    
    public static void doOtherthing() throws FileNotFoundException {
        FileNotFoundException err = new FileNotFoundException();
        throw err;
    }

    private static void doSomething() throws BadParametersException {
        FileReader fileReader = null;
        try {
            // wird nicht mehr ausgeführt!
            fileReader = new FileReader(new File("text.txt"));
        } catch(FileNotFoundException e) {
            System.out.println("Fancy Message 01!");
            throw new BadParametersException(e);
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            // wird ausgeführt, wenn catch oder try am ende 
            // angekommen ist, bevor es zum return / throw kommt
            try {
                if(fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
