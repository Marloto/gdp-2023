package lecture20230622.chapter11;

import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    static ReentrantLock reentrantLock = new ReentrantLock();
    
    public static void main(String[] args) {
        try {
            reentrantLock.tryLock();
            // <- do something
        } finally {
            reentrantLock.unlock();
        }
        return;
    }
}
