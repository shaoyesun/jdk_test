package thread.waitandnotify;

/**
 * Created by root on 17-4-27.
 */
public class WaitAndNotifyModel {
    public static void main(String[] args) {
        Object object = new Object();
        WaitAndNotify wn = new WaitAndNotify(object);
        wn.start();
        WaitAndNotify1 wn1 = new WaitAndNotify1(object);
        wn1.start();
    }
}
