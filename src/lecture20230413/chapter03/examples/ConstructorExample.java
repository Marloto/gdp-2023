package lecture20230413.chapter03.examples;

import java.util.Objects;

class A extends Object {
    public A() {
        super();
        System.out.println("A erzeugt");
    }
    
    public int doSomething(int a, int b) {
        return a + b;
    }
    
    public void a() {
        
    }
}

class B extends A{
    public B() {
        // <- sprung zu Konstruktor in A
        super();
        System.out.println("B erzeugt");
    }
    
    public int doSomething(int a, int b) {
        return super.doSomething(a, b) * 2;
    }
    
    public void b() {
        
    }
    
    public B(String name) {
        this(); // <-
        
        System.out.println("B.name erzeugt");
    }
}

class C extends B{
    private String abc; 
    
    public C() {
        // <- sprung zu Konstruktor in B
        super("Test");
        System.out.println("C erzeugt");
    }
    public int doSomething(int a, int b) {
        return super.doSomething(a, b) * 4;
    }
    
    public int doSomething(double a, double b) {
        return super.doSomething((int) a, (int) b) * 4;
    }
    
    
    
//    public boolean equals(Object obj) {
//        if(obj == this) {
//            return true;
//        }
//        if(obj == null) {
//            return false;
//        }
//        if(obj instanceof C) {
//            C c = (C)obj;
//            if(c.abc == null && this.abc == null) {
//                return true;
//            } else if(c.abc == null) {
//                return false;
//            }
//            return c.abc.equals(this.abc);
//        }
//        return false;
//        
//        
//        
////        if(obj instanceof String) {
////            return obj.equals(this.abc);
////        }
//    }
    
    @Override
    public int hashCode() {
        return Objects.hash(abc);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        C other = (C) obj;
        return Objects.equals(abc, other.abc);
    }
    public void c() {
        
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        System.out.println(a.doSomething(2, 4));
        // System.out.println(a.doSomething(2.0, 4.0));
        System.out.println(c.doSomething(2, 4));
        System.out.println(c.doSomething(2.0, 4.0));
        System.out.println(a.toString());
        System.out.println(a.equals("String"));
        
        A a1 = new B(); // od. new C()
        a1.a();
        
        
        System.out.println("Test: " + a1.doSomething(2, 4));
        
        // Wie kann man Typen prüfen?
        if(a1 instanceof A) {
            System.out.println("ist A");
        }
        if(a1 instanceof B) {
            System.out.println("ist B");
        }
        if(a1 instanceof C) {
            System.out.println("ist C");
            C c1 = (C) a1;
            c1.a();
            c1.b();
            c1.c();
        }
        
        
    }
}
