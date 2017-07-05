package thread.waitandnotify;

/**
 * @ 1.wait和notify只能在同步方法或同步块中调用,否则抛出IllegalMonitorStateException异常
 * @ 2.用于线程间通信
 * @ 3.线程wait后必须有notify或notiAll唤醒，否则线程将永远等待下去
 * @ 4.wait可以使调用该方法的线程释放共享资源的锁
 * @ 5.notify可以随机唤醒等待队列中等待同一共享资源的一个线程
 * @ 6.notifyAll可以唤醒等待队列中等待同一共享资源的全部线程
 * @ 7.有参数wait可以自己到时唤醒，亦可以由别的线程唤醒
 */
public class Wait extends Thread {
    private Object object;

    public Wait(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            try {
                System.out.println("start wait time : " + System.currentTimeMillis());
                object.wait();
                System.out.println("end wait time : " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
