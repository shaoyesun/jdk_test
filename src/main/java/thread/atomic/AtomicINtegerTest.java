package thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子类
 */
public class AtomicINtegerTest extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
