package thread.waitandnotify;

/**
 * Created by root on 17-4-27.
 */
public class WaitAndNotifyModel {
    public static void main(String[] args) {
        Object object = new Object();
        Wait wait = new Wait(object);
        wait.start();
        Notify notify = new Notify(object);
        notify.start();
    }
}
