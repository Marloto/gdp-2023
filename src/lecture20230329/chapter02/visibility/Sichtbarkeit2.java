package lecture20230329.chapter02.visibility;

class MoreSichtbarkeit {
	
}

public class Sichtbarkeit2 {
	public int a;
	private int b;
	
	public Sichtbarkeit2() {
		this.b = 42;
	}
	
	public void doSomething(Sichtbarkeit2 x) {
		x.b = 21;
	}
	
	private void doSomething(double x) {
		
	}
	
	public static void main(String[] args) {
		Sichtbarkeit2 s = new Sichtbarkeit2();
		s.a = 12;
		s.b = 42;
	}
}
