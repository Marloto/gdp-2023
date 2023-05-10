package lecture20230510.chapter06;

import java.util.Iterator;

public class RandomizerMain {
    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer(0, 10, 5);
        // Math.random(); -> 0 - 1
        // -> Math.random() * (max - min) + min
        for(Double rnd : randomizer) {
            System.out.println(rnd);
        }
        Iterator<Double> iterator = randomizer.iterator();
        while(iterator.hasNext()) {
            Double rnd = iterator.next();
            System.out.println(rnd);
        }
    }
}
