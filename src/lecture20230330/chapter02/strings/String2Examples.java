package lecture20230330.chapter02.strings;

public class String2Examples {
    public static void main(String[] args) {
        // 
        String a = "Test";
        String b = "Test";
        String c = new String("Test");
        String d = null; // null
        
        // true, begründung: java optimiert!
        // false: unterschiedliche referenzen 
        //        wären denkbar
        if(a == b) {
            System.out.println("True1");
        }
        if(c == b) {
            System.out.println("True2");
        }
        
        if(a.equals(c)) {
            System.out.println("True3");
        }
        if(a.equals(b)) {
            System.out.println("True4");
        }
        if(d != null && d.equals(c)) {
            
        }
        if("Test".equals(d)) {
            
        }
    }
}
