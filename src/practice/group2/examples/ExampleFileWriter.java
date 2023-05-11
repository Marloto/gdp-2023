package practice.group2.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileWriter {
    public static void main(String[] args) {
        // OutputStream <- basis allen übels
        // FileOutputStream
        // FileWriter
        FileWriter writer = null;
        try {
            writer = new FileWriter(new File("text.txt"));
            writer.write("Something");
        } catch(IOException e) {
            
        } finally {
            if(writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // u.a. werden schreibprozesse noch finalisiert
            }
        }
        
        try(FileWriter writer2 = new FileWriter(new File("text.txt"))) {
            writer2.write("Something");
        } catch(IOException e) {
            
        }
    }
}
