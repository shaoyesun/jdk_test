package thread.volatiles;

/**
 * @ 1.保证实例变量在多个线程间的可见性，不保证原子性;synchronized可以保证原子性及可见性
 * @ 2.volatile只能修饰变量;synchronized可以修饰方法及代码块
 * @ 3.volatile不会发生阻塞;synchronized会发生阻塞
 * @ 4.volatile解决多个线程间的可见性;synchronized解决多个线程间的同步性
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
