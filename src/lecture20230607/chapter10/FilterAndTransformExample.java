package lecture20230607.chapter10;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

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
    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + "]";
    }
}

public class FilterAndTransformExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("5;Buddy");
        list.add("2;Charly");
        list.add("3;Bruno");
        list.add("7;Sammy");
        
        list.stream()
            .map((input) -> Animal.fromString(input))
//            .filter((animal) -> animal.getAge() >= 4)
//            .filter((animal) -> animal.getName().startsWith("B"))
            .filter((animal) -> animal.getAge() >= 4 &&
                 animal.getName().startsWith("B"))
            .forEach(System.out::println);
        
        // Ohne Stream und Lambda
        for(String var: list) {
            Animal animal = Animal.fromString(var);
            if(animal.getAge() >= 4 && animal.getName().startsWith("B")) {
                System.out.println(animal);
            }
        }
        
    }
}
