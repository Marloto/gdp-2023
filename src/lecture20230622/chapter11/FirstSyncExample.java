package lecture20230622.chapter11;

public class FirstSyncExample {
    
    private static Object sync = new Object();
    
    // static synchronized -> nur ein Thread zur selben Zeit in der Methode
    // synchronized -> nur ein Thread zur selben Zeit in der Methode (je Objekt)
    public void doSomething() {
        synchronized(sync) {
            System.out.println("Hello! " + Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public static class MyRunnable implements Runnable {
        FirstSyncExample example = new FirstSyncExample();
        public void run() {
            while(true) {
                example.doSomething();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        new Thread(new MyRunnable()).start();
        
        // Sync: syncronized
        //   alt. Lock
    }
}
