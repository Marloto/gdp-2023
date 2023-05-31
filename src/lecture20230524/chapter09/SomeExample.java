package lecture20230524.chapter09;

import lecture20230510.chapter06.PersonMain;

public class SomeExample {
    
    private int abc;
    
    private class SomeInnerExample {
        private int abc;
        public void print() {
            System.out.println(SomeExample.this.abc);
        }
    }
    
    public SomeInnerExample doSometing() {
        return new SomeInnerExample();
    }

    
    public static void main(String[] args) {
        SomeExample someExample = new SomeExample();
        SomeInnerExample doSometing = someExample.doSometing();
    }
}
