package lecture20230614.chapter10.performance;

public class InnerClassCase {
    private static class SomeRunnable implements Runnable {
        public void run() {
            System.out.println("Hello, World!");
        }
    }
    public static void main(String[] args) {
        Runnable example = new SomeRunnable();
        
        example.run();
    }
}
