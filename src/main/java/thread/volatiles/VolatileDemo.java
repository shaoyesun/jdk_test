package thread.volatiles;

/**
 * Created by root on 17-4-27.
 */
public class VolatileDemo {
    public static void main(String[] args) {
        Volatile[] volatiles = new Volatile[100];
        for (int i = 0; i < 100; i++) {
            volatiles[i] = new Volatile();
        }
        for (int i = 0; i < 100; i++) {
            volatiles[i].start();
        }
    }
}
