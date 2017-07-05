package thread.atomic;

public class AtomicINtegerDemo {
    public static void main(String[] args) {
        AtomicINtegerTest atomicINtegerTest = new AtomicINtegerTest();
        Thread t1 = new Thread(atomicINtegerTest);
        t1.start();
        Thread t2 = new Thread(atomicINtegerTest);
        t2.start();
        Thread t3 = new Thread(atomicINtegerTest);
        t3.start();
        Thread t4 = new Thread(atomicINtegerTest);
        t4.start();
    }
}
