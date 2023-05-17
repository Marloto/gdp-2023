package lecture20230517.chapter07;

class SomeErrors {
    public void doSomething(int i) {
        if (i < 10) {
            throw new IllegalArgumentException("i muss größer oder gleich 10 sein");
        }
    }
}

public class MoreErrors extends SomeErrors {
    public MoreErrors() {
        super.doSomething(9);
    }

    public void doSomething(int i) {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        MoreErrors errors = null;
        errors = new MoreErrors();
        errors.doSomething(0); // <-

        SomeErrors errors2 = new SomeErrors();
        errors2.doSomething(0);
    }
}