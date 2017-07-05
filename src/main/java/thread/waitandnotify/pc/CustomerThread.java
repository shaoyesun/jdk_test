package thread.waitandnotify.pc;

/**
 * Created by root on 17-4-27.
 */
public class CustomerThread extends Thread {
    private Factory f;

    public CustomerThread(Factory f) {
        this.f = f;
    }

    @Override
    public void run() {
        while (true)
            f.cus();
    }
}
