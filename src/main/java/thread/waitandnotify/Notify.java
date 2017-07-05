package thread.waitandnotify;

public class Notify extends Thread {
    private Object object;

    public Notify(Object object) {
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
