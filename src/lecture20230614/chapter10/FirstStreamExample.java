package lecture20230614.chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStreamExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        
        arrayList.add("42");
        arrayList.add("21");
        arrayList.add("12");
        
        List<Integer> res2 = arrayList.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        
        List<Integer> res3 = new ArrayList<>();
        for(String el : arrayList) {
            Integer valueOf = Integer.valueOf(el);
            res3.add(valueOf);
        }
        
        arrayList.stream()                  // Create-Operation: Stream<String> 
              .map(Integer::valueOf)        // Intermediate-Operation: Stream<Integer>
              .map((input) -> input + 2)    // Intermediate-Operation: Stream<Integer>
              .filter((x) -> x > 30)
              .forEach(System.out::println);// Terminal-Operation
        
        for(String el : arrayList) {
            Integer valueOf = Integer.valueOf(el);
            valueOf = valueOf + 2;
            if(valueOf > 30) {
                System.out.println(valueOf);
            }
        }
        
        //stream.map(null);
        //stream.filter(null);
        
        // Function<I, O>-Interface -> irgendwas
        // Predicate<I>-Interface -> boolean
        // Consumer<I>-Interface -> void
//        Function<String, Integer> example = Integer::valueOf;
//
//        Stream<Integer> stream2 = stream.map(example);
//        
//        Function<Integer, Integer> other = (input) -> input + 2;
//        Stream<Integer> stream3 = stream2.map(other);
    }
}
