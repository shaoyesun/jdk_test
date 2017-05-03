package thread.waitandnotify.pc;

/**
 * Created by root on 17-4-27.
 */
public class PCModel {
    public static void main(String[] args) {
        Factory f = new Factory();
        ProducerThread pt = new ProducerThread(f);
        CustomerThread ct1 = new CustomerThread(f);
        CustomerThread ct2 = new CustomerThread(f);
        pt.start();
        pt.setName("pt");
        ct1.start();
        ct1.setName("ct1");
        ct2.start();
        ct2.setName("ct2");
    }
}
