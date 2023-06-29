package lecture20230622.chapter11;

import java.util.ArrayList;
import java.util.List;

public class SecondSyncExample {
    
    private List<String> something = new ArrayList<>();
    
    public void add(String msg) {
        synchronized(something) {
            this.something.add(msg);
        }
    }
    
    public void remove(String msg) {
        synchronized(something) {
            this.something.remove(msg);
        }
    }
    
    public String getRandom() {
        if(something.size() > 0) {
            synchronized(something) {
                if(something.size() > 0) {
                    return something.get(something.size() - 1);
                }
            }
        }
        return null;
    }
    
    public void both() {
        synchronized(something) {
            String random = this.getRandom();
            if(random != null)
                this.remove(random);
        }
    }
    
    public class AddRunnable implements Runnable {
        public void run() {
            while(true) {
                // <- synchronized(something)
                add("Random: " + Math.random());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public class RemoveRunnable implements Runnable {
        public void run() {
            while(true) {
                both();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void start() {
        new Thread(new AddRunnable()).start();
        new Thread(new RemoveRunnable()).start();
    }
    
    public static void main(String[] args) {
        new SecondSyncExample().start();
        // Sync: syncronized
        //   alt. Lock
    }
}

