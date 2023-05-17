package lecture20230503.chapter06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashVsTreeExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        
        set1.add(42);
        set1.add(1);
        set1.add(21);
        set1.add(10);
        set1.add(42);
        
        set2.add(42);
        set2.add(1);
        set2.add(21);
        set2.add(10);
        
        for (Integer x : set1) {
            System.out.println(x);
        }
        System.out.println("---");
        for (Integer x : set2) {
            System.out.println(x);
        }
    }
}
