package practice.group2.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExampleFileReader {
    public static void main(String[] args) {
        //byte[] data;
        
        // -> Stream
//        InputStream stream = null;
//        try {
//            int read = stream.read();
//            // 0..255 -> daten im paket an einer Stelle
//            // -1 keine weiteren daten!
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        
//        new FileInputStream()
        // new BufferedInputStream(null)
        //FileReader reader = new FileReader(new File("text.txt"));
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("text.txt"));
            while(scanner.hasNextLine())  {
                String nextLine = scanner.nextLine(); // <- hier spielt der spaß
            }
            // <-
        } catch(Exception e) {
            // return oder weiterreichen
            // <-
        } finally {
            if(scanner != null)
                scanner.close();
        }
        
//        try(Scanner scanner = new Scanner(new File("text.txt"))) {
//            
//        } catch(Exception e) {
//            
//        } // finally wird automatisch mit close umgesetzt
        
        
        // existiert nicht, keine zugriffsrechte, usw.
    }
}
