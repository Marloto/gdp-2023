package lecture20230622.chapter11;

public class SyncExample implements Runnable {
    private static Object sync = new Object();
    private int zaehler = 0;
    
    public void run() {
        while(true) {
            this.doSomething();
        }
    }
    
    public void doSomething() {
        synchronized (sync) {
            System.out.println("Enter doSomething " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": " + zaehler ++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Exit doSomething " + Thread.currentThread().getName());
        }
    }
    
    public static void main(String[] args) {
        //Runnable r = new SyncExample();
        Thread thread1 = new Thread(new SyncExample(), "T1");
        Thread thread2 = new Thread(new SyncExample(), "T2");
        Thread thread3 = new Thread(new SyncExample(), "T3");
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        // Mehr zum Thema: Spezielle Klasse -> ReentrantLock
        // Jedes Objekt hat eine "Warteliste" in der man sich eintragen kann -> new Object().wait / notify
        // Darüber wird die sync-Mechanik realisiert
    }
}