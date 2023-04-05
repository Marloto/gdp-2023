package lecture20230330.chapter02.strings;

public class StringExamples {
    public static void main(String[] args) {
        String ref = "Test";
        int length = ref.length();
        for(int i = 0; i < ref.length(); i ++) {
            char charAt = ref.charAt(i);
            if(charAt == 'T') {
                System.out.println("T an " + i + " gefunden");
            }
        }
        
        ref = ref.replace("st", "xt");
        System.out.println(ref);
        
        String ref2 = "Test";
        ref2 = ref2 + "1" + "3";
        
        // drei string objekte
        // aber alle zeigen auf das
        // selbe byte array
        String base = "Test";
        String a = new String(base);
        String b = new String(base);
        String c = new String(base);
    }
}
