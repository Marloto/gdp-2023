package lecture20230413.chapter03.intro;

class Vermoegen {}

class Bankkonto extends Vermoegen {}

class Sparkonto extends Bankkonto {}

// Vererbung ist Baumförmig / Hierarchisch
// class A extends B; class B extends C; class C extends A
// Zyklen in Aggregationen möglich:
// class A { private B b; } class B { private A a; }
// Mehrfachverberung? Nicht in Java erlaubt! Aber grundsätzlich denkbar.

public class BankExample {

}
