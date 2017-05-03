package thread.waitandnotify.pc;

public class Factory {
    public static int count = 0;
    Object object = new Object();

    public void pro() {
        synchronized (object) {
            if(count > 0) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            System.out.println("pro : " + count);
            object.notify();
        }
    }

    public void cus() {
        synchronized (object) {
            if(count <= 0) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count--;
            System.out.println("cus : " + count);
            object.notify();
        }
    }

}
