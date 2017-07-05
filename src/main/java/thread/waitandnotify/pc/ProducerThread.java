package thread.waitandnotify.pc;

/**
 * Created by root on 17-4-27.
 */
public class ProducerThread extends Thread {
    private Factory f;

    public ProducerThread(Factory f) {
        this.f = f;
    }

    @Override
    public void run() {
        while (true)
            f.pro();
    }
}
