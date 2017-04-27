package thread.volatiles;

/**
 * 保证实例变量在多个线程间的可见性，不保证原子性
 */
public class Volatile extends Thread {
    volatile public static int count;

    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println(count);
    }

    @Override
    public void run() {
        super.run();
        addCount();
    }
}
