package lecture24052023.chapter09;
class A { }
public class Example {
 public class B { }
 public static class C { }
 public void doSomething() {
  new A();
  new B();
  new C();
 }
 public static void main(String[] args) {
  new A();
  // new B();
  new C();
 }
}