package thread.DeadLock;

/**
 * Created by root on 17-4-21.
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        DeadLock dt = new DeadLock();
        dt.setName("a");
        Thread t1 = new Thread(dt);
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dt.setName("b");//同一DeadLock实例保证线程a、b竞争的共享资源为同一对象
        Thread t2 = new Thread(dt);
        t2.start();
    }
}
