package lecture20230510.chapter06;

import java.util.Iterator;

public class Randomizer implements Iterable<Double> {
    private double min;
    private double max;
    private int n;

    public Randomizer(double min, double max, int n) {
        this.min = min;
        this.max = max;
        this.n = n;
    }
    
    public int getN() {
        return n;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public Iterator<Double> iterator() {
        // übergeben eines randomizers
        return new RandomizerIterator(this);
    }
    
}
