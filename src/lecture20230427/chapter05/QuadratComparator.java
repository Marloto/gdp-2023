package lecture20230427.chapter05;

import java.util.Comparator;

public class QuadratComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        // o1 <  o2 ----> -1 bzw. < 0
        // o1 == o2 ---> 0
        // o1 >  o2 ----> +1 bzw. > 0
        
        // seitenlaenge; was für fehler können entstehen?
        // - cast auf Quadrat
        // - ist ein Quadrat? instanceof
        // - null referenzen ggf. möglich
        // - Seitenlaenge vergleichen
        
        if(o1 == null && o2 == null) {
            return 0;
        } else if(o1 == null) {
            return -1;
        } else if(o2 == null) {
            return 1;
        }
        
        Quadrat q1 = (Quadrat) o1;
        Quadrat q2 = (Quadrat) o2;
        
        return Integer.valueOf(q1.getSeitenlaenge()).compareTo(q2.getSeitenlaenge());
    }

}
