
public class SomeArrayClass {
    private int[] values;

    public boolean equals(Object obj) {
        SomeArrayClass other = (SomeArrayClass) obj;
        
        int[] a = this.values;
        int[] b = other.values;
        
        if(a.length != b.length) {
            return false;
        }
        
        //iteration über array und werte vergleichen
        boolean res = true;
        for (int i = 0; i < b.length; i++) {
            if(a[i] != b[i]) {
                res = false;
            }
        }
        
        return res;
    }
}
