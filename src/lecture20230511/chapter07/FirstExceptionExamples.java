package lecture20230511.chapter07;

import java.io.File;
import java.io.FileReader;

public class FirstExceptionExamples {
    public static void doSomething(String str) {
        // ...
        str.trim();
    }
    
    public static void a() {
       
        double random = Math.random();
        if(random < 0.5)
            b();
        else
            c();
    }
    public static void b() {
        c();
    }
    public static void c() {
        int[] ref = new int[2147483647];
    }
    
    public static void d() {
        d();
    }
    
    public static void main(String[] args) {
//        String s = null;
//        doSomething(s);
//        String h = "Hello, World";
//        if(h.substring(10, 15) == "World") {
//            System.out.println("Endet mit World");
//        }
        a();
        //int[] ref = new int[2147483647]; //ram?
//        File file = new File("notapath");
//        new FileReader(file);
        
//        d();
    }
}
