
public class Sichtbarkeit1 {

	
	public void doSomething(Sichtbarkeit2 x) {
		x.doSomething(x);
		x.a = 12;
		// x.b = 21; <- geht nicht
		// x.doSomething(12); <- geht nicht
	}
	
	public static void main(String[] args) {
		MoreSichtbarkeit m = new MoreSichtbarkeit();
		Sichtbarkeit2 s = new Sichtbarkeit2();
		s.a = 12;
		
		// s.b = 42;
	}
}
