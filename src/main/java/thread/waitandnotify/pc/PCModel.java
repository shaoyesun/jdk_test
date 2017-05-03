package thread.waitandnotify.pc;

/**
 * Created by root on 17-4-27.
 */
public class PCModel {
    public static void main(String[] args) {
        Factory f = new Factory();
        ProducerThread pt = new ProducerThread(f);
        CustomerThread ct = new CustomerThread(f);
        pt.start();
        ct.start();
    }
}
