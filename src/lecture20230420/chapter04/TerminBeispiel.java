package lecture20230420.chapter04;

import java.util.Scanner;

public class TerminBeispiel {

    
    public static void main(String[] args) {
        Termin t = new Termin(TerminTyp.ONLINE);
        if(t.getTyp() == TerminTyp.ONLINE)
            System.out.println("Ist online...");
        System.out.println(t);
        
        for(TerminTyp t5: TerminTyp.values() ) {
            System.out.println(t5.name()  + ":" + t5.ordinal());
            System.out.println(t5.toString());
        }
        
        TerminTyp typ = t.getTyp();
        TerminTyp.ONLINE.equals(typ);
        System.out.println(typ.ordinal());
        System.out.println(typ.name());
        TerminTyp t3 = TerminTyp.ONLINE;
        
        int dauer = t3.getDefaultDauer();
        int dauer2 = TerminTyp.ONLINE.getDefaultDauer();
        
        
        
        
        if(t.getTyp() instanceof Enum) {
            System.out.println("Ist enum");
        }
        if(t.getTyp() instanceof Object) {
            System.out.println("Ist object");
        }

        TerminTypSelfMade made = TerminTypSelfMade.ONLINE;
        System.out.println(made.getOrdinal());
        System.out.println(made.getName());
        
        
        
        
        
        if(made == TerminTypSelfMade.ONLINE) {
            System.out.println("Passt...");
        }
        
        
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        String next = scanner.next();
        
        // Wie könnte man aus einer Eingabe
        // die passenden Referenz finden?
        
        // (TerminTyp)nextInt; kein Cast möglich
        TerminTyp[] values = TerminTyp.values();
        TerminTyp toFind;
        for(int i = 0; i < values.length; i ++) {
//            if(values[i].name().equals(next)) {
//            
//            }
            if(values[i].ordinal() == nextInt) {
                toFind = values[i];
                break;
            }
        }
        
        TerminTyp t2 = TerminTyp.valueOf("ONLINE");
        TerminTyp t4 = TerminTyp.values()[nextInt];
        
        
        
        
    }
}
