package thread.DeadLock;

/**
 * Created by root on 17-4-21.
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        DeadLock dt = new DeadLock();
        dt.setUsername("a");
        Thread t1 = new Thread(dt);
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dt.setUsername("b");
        Thread t2 = new Thread(dt);
        t2.start();
    }
}
