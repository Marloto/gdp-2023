
public class StaticExample {
    private static int x = 42;
    
    private static void doOtherthing() {
        
    }
    
    private void doSomething() {

    }
    public static void main(String[] args) {
        StaticExample example = new StaticExample();
        example.doSomething();
        
        StaticExample.doOtherthing();
        
        
        System.out.println();
    }
}
