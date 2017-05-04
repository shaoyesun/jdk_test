package thread.join;

/**
 * Join把指定的线程加入到当前线程，可以将两个交替执行的线程合并为顺序执行的线程
 */
public class Model {
    public static void main(String[] args) {
        JoinThread joinThread = new JoinThread();
        joinThread.start();
        try {
            joinThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main method");
    }
}
