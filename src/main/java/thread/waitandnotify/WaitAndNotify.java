package thread.waitandnotify;

/**
 * @ 1.wait和notify只能在同步方法或同步块中调用,否则抛出IllegalMonitorStateException异常
 * @ 2.用于线程间通信
 * @ 3.线程wait后必须有notify或notiAll唤醒，否则线程将永远等待下去
 */
public class WaitAndNotify extends Thread {
    private Object object;

    public WaitAndNotify(Object object) {
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
