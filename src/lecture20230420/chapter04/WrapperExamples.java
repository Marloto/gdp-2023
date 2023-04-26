package lecture20230420.chapter04;

public class WrapperExamples {
    public static void main(String[] args) {
        int i1 = 42;
        //Integer i2 = new Integer(42);
        Integer i2 = Integer.valueOf(42);
        Integer i3 = 42; // autoboxing
        int i4 = Integer.valueOf(42); // autounboxing
        // -> vgl. i4 = Integer.valueOf(42).intValue();
        int i5 = 12 + i3;
        
        if(i1 == 42) System.out.println("42 == 42 (i1)");
        if(i2 == 42) System.out.println("42 == 42 (i2)");
        if(i2 == i3) System.out.println("42 == 42 (i3)");
        if(Integer.valueOf(1) == Integer.valueOf(1)) System.out.println("1 == 1");
        if(Integer.valueOf(128) == Integer.valueOf(128)) System.out.println("128 == 128");
        if(Integer.valueOf(128).equals(Integer.valueOf(128))) System.out.println("128 == 128 (equals)");
        
        double d1 = 2.12;
        Double d2 = Double.valueOf(2.12);
        
        boolean b1 = true;
        Boolean b2 = Boolean.valueOf(true);
        
        
    }
}
