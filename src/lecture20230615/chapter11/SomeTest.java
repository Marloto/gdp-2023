package lecture20230615.chapter11;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SomeTest {
    
    
    public static class SomeThread implements Runnable {
        private Map<Integer, String> list = new HashMap<>();
        private int i;
        private boolean running = true;
        
        private void stop() {
            this.running = false;
        }
        
        public void run() {
            while(this.running) {
                Thread currentThread = Thread.currentThread();
                long id = currentThread.getId();
                
                int key = i ++;
                list.put(key, "Test");
                
                System.out.println(id + ": " + list.get(key) + " - " + list.size() );
                
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
            
            // Thread ist beendet, wenn die Run-Methode beendet wird
        }
    }


    public static void main(String[] args) throws IOException {
        Thread currentThread = Thread.currentThread();
        
        System.out.println("Starter: " + currentThread.getId());
        
        SomeThread target = new SomeThread();
        Thread thread = new Thread(target, "Player1");
        thread.setDaemon(true);
        thread.start();
        Thread thread2 = new Thread(target, "Player2");
        thread2.setDaemon(true);
        thread2.start();
        
        System.in.read();
        
//        Map<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        // Take Away: Datenstrukturen nicht in Thread-Kontext verwenden, ohne Absicherung!
    }
}
