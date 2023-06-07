package lecture20230607.chapter10;

import lecture20230524.chapter09.Example.B;

interface Operator<T> {
    T calc(T a, T b);
}

class SomePosition {
    public int a, b;
    public SomePosition(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }
}

public class MathExample {
    public static void main(String[] args) {
        Operator<Integer> add = new Operator<>() {
            public Integer calc(Integer a, Integer b) {
                return a + b;
            }
        };
        
        Operator<Integer> add2 = (x, y) -> x + y;
        Integer res2 = add2.calc(2, 1);
        
        Operator<SomePosition> add3 = (x, y) -> new SomePosition(x.a + y.a, x.b + y.b) ;
        SomePosition res3 = add3.calc(new SomePosition(1, 1), new SomePosition(2, 2));
    }
}
