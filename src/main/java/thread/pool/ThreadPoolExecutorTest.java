package thread.pool;

import java.util.concurrent.*;

/**
 *  用Executors创建线程池，减少频繁创建线程的开销，提高系统性能
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        //newCachedThreadPool();
        //fixThreadPool();
        //newScheduledThreadPool();
        newScheduledThreadPool1();
    }

    //表示延迟1秒后每3秒执行一次
    public static void newScheduledThreadPool1() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread() + " delay 1 seconds, and excute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);
    }

    public static void newScheduledThreadPool() {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        scheduledThreadPool.schedule(new Runnable() {
            public void run() {
                System.out.println("delay 3 seconds");
            }
        }, 3, TimeUnit.SECONDS);
    }

    //创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程
    public static void fixThreadPool() {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            fixedThreadPool.execute(new Runnable() {
                public void run() {
                    try {
                        System.out.println(Thread.currentThread() + " " + index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    //创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们
    public static void newCachedThreadPool() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread() + " " + index);
                }
            });
            cachedThreadPool.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread() + " " + (index + 10));
                }
            });
        }
    }

}
