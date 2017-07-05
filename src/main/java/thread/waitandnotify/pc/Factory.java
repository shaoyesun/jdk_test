package thread.waitandnotify.pc;

public class Factory {
    public static int count = 0;
    Object object = new Object();

    public void pro() {
        synchronized (object) {
            while (count > 0) {
                try {
                    System.out.println("pro wait | " + Thread.currentThread().getName());
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            System.out.println("pro : " + count + " | " + Thread.currentThread().getName());
            object.notifyAll();
        }
    }

    public void cus() {
        synchronized (object) {
            while (count <= 0) {
                try {
                    System.out.println("cus wait | " + Thread.currentThread().getName());
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                count--;
                System.out.println("cus : " + count + " | " + Thread.currentThread().getName());
            object.notifyAll();
        }
    }

}
