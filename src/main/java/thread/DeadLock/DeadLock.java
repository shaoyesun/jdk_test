package thread.DeadLock;

/**
 * Created by root on 17-4-21.
 */
public class DeadLock implements Runnable {
    public String name;
    public Object object1 = new Object(),object2 = new Object();
    public void run() {
        if(name.equals("a")) {
            synchronized (object1) {
                System.out.println(name + " 获得 object1，等待 object2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { e.printStackTrace();}
                synchronized (object2) { System.out.println("1-->2");}
            }
        }
        if(name.equals("b")) {
            synchronized (object2) {
                System.out.println(name + " 获得 object2,等待 object1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { e.printStackTrace();}
                synchronized (object1) { System.out.println("2-->1");}
            }
        }
    }
    public void setName(String name) {
        this.name = name;
    }
}
