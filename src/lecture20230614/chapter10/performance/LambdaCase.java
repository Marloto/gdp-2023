package lecture20230614.chapter10.performance;

public class LambdaCase {
    public static void main(String[] args) {
        Runnable example = () -> System.out.println("Hello, World");
        
        example.run();
    }
}
