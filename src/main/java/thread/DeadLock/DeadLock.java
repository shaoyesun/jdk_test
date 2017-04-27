package thread.DeadLock;

/**
 * Created by root on 17-4-21.
 */
public class DeadLock implements Runnable {
    public String username;
    public Object object1 = new Object();
    public Object object2 = new Object();

    public void setUsername(String username) {
        this.username = username;
    }

    public void run() {
        if(username.equals("a")) {
            synchronized (object1) {
                System.out.println("username = " + username);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object2) {
                    System.out.println("1-->2");
                }
            }
        }
        if(username.equals("b")) {
            synchronized (object2) {
                System.out.println("username = " + username);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object1) {
                    System.out.println("2-->1");
                }
            }
        }
    }
}
