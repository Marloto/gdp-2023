package lecture20230607.chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//interface Transform<I, O> { // <- Function
//    O doIt(I text);
//}
//
//interface Filter<I> { // <- Predicate
//    boolean filter(I animal);
//}
//
//
//interface Printer<I> { // <- Consume
//    void doSomething(I animal);
//}

class Animal {
    private int age;
    private String name;
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public static Animal fromString(String input) {
        String[] split = input.split(";");
        int age = Integer.parseInt(split[0]);
        String name = split[1];
        return new Animal(age, name);
    }
}

public class FilterAndTransformExample {
    
    public static List<Animal> transform(List<String> list, Function<String, Animal> transformer) {
        List<Animal> result = new ArrayList<>();
        for(String line : list) {
            result.add(transformer.apply(line));
        }
        return result;
    }
    
    public static List<Animal> filter(List<Animal> list, Predicate<Animal> filter) {
        List<Animal> result = new ArrayList<>();
        for(Animal animal : list) {
            if(filter.test(animal))
                result.add(animal);
        }
        return result;
    }
    
    public static void consume(List<Animal> list, Consumer<Animal> printer) {
        for(Animal animal : list) {
            printer.accept(animal);
        }
    }
    public static void doAll(List<String> input, Function<String, Animal> transformer, Predicate<Animal> filter, Consumer<Animal> printer) {
        for(String line : input) {
            Animal animal = transformer.apply(line);
            if(filter.test(animal)) {
                printer.accept(animal);
            }
        }
    }
    
    public static void doSomething(Runnable run) {
        run.run();
    }
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("5;Buddy");
        list.add("2;Charly");
        list.add("3;Bruno");
        list.add("7;Sammy");
        
        List<Animal> transform = transform(list, (input) -> Animal.fromString(input));
        List<Animal> filter = filter(transform, (animal) -> animal.getAge() >= 4);
        consume(filter, (animal) -> System.out.println(animal.getName()));
        
        doAll(list, (input) -> Animal.fromString(input), 
            (animal) -> animal.getAge() >= 4, 
            (animal) -> System.out.println(animal.getName()));
        
        doSomething(() -> {
            // ...
        });
    }
}
