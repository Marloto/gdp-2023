package lecture20230329.chapter02.parameters;

class Morething {
	int a;
}


public class Parameter {
	
	void doSomething(int x) {
		x ++;
	}
	void doSomething(Morething obj) {
		obj.a ++;
	}
	
	public static void main(String[] args) {
		Parameter p = new Parameter();
		Morething m = new Morething();
		
		m.a = 12;
		p.doSomething(m);
		System.out.println(m.a);
		
		int y = 12;
		p.doSomething(y);
		System.out.println(y);
	}
}
