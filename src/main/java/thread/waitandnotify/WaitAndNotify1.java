package thread.waitandnotify;

public class WaitAndNotify1 extends Thread {
    private Object object;

    public WaitAndNotify1(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        synchronized (object) {
            System.out.println("start notify time : " + System.currentTimeMillis());
            object.notify();
            System.out.println("end notify time : " + System.currentTimeMillis());
        }

    }
}
