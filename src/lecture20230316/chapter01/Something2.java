package lecture20230316.chapter01;
// First Eclipse Snippet from 16.03.2023
public class Something2 {
	public static int ggT(int zahl1, int zahl2) {
		int rest, ggt;
		rest = 0;
		do {
			ggt = rest;
			rest = zahl1 % zahl2;
			zahl1 = zahl2;
			zahl2 = rest;
		} while (rest != 0);
		return ggt;
	}

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int resGgT = ggT(a, b);
        System.out.print("Ergebnis ggT: ");
        System.out.println(resGgT);

//	   double d = scanner.nextDouble();
//	   int e = (int) scanner.nextDouble();

//	   int c = (int) 1.23; // -> 1
//	   double x = 123;
//	   Math.round(1.23);
	}
}
