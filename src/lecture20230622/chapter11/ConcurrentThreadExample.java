package lecture20230622.chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ConcurrentThreadExample {
    private boolean stopped = true;
    private Map<Double, String> map;
    
    public ConcurrentThreadExample() {
        map = new HashMap<>();
    }

    public class RunnerA implements Runnable {
        public void run() {
            while (!stopped) {
                map.put(Math.random(), "Test");
            }
        }
    }

    public class RunnerB implements Runnable {
        public void run() {
            while (!stopped) {
                if(map.size() > 0) {
                    Iterator<Double> iterator = map.keySet().iterator();
                    double i;
                    Double next;
                    do {
                        next = iterator.next();
                        i = Math.random();
                    } while(i >= 0.25 && iterator.hasNext());
                    map.remove(next);
                }
            }
        }
    }
    
    private void start() {
        stopped = false;
        new Thread(new RunnerA()).start();
        new Thread(new RunnerB()).start();
    }
    
    public static void main(String[] args) {
        ConcurrentThreadExample example = new ConcurrentThreadExample();
        example.start();
    }
}
