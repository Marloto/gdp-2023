package lecture20230316.chapter01;
public class Something {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int resGgT = ggT(a, b);
        int resKgV = kgV(a, b);
        System.out.print("Ergebnis ggT: ");
        System.out.println(resGgT);
        System.out.print("Ergebnis kgV: ");
        System.out.println(resKgV);
    }
    public static int kgV (int a, int b){
        return (a*b) / ggT(a,b);
    }
    public static int ggT(int zahl1, int zahl2) {
        int rest, ggt;
        rest=0;
        do {
            ggt= rest;
            rest = zahl1 % zahl2;
            zahl1 = zahl2;
            zahl2 =rest;
        }while(rest !=0);
        return ggt;
    }
}