package lecture20230510.chapter06;

import java.util.Iterator;

public class RandomizerIterator implements Iterator<Double> {

    private Randomizer rand;
    private int i;

    public RandomizerIterator(Randomizer rand) {
        this.rand = rand;
        this.i = 0;
    }
    
    public boolean hasNext() {
        return this.i < rand.getN();
    }

    public Double next() {
        double max = rand.getMax();
        double min = rand.getMin();
        double value = Math.random() * (max - min) + min;
        this.i ++;
        return value;
    }

}
