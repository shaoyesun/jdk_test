package thread.interrupt;

/**
 * @ 1.interrupt标记线程为中断状态
 * @ 2.interrupted测试当前线程是否中断，并清除中断标记为false
 * @ 3.isInterrupted测试线程是否中断
 */
public class InterruptThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 50000; i++) {
            System.out.println("i = " + i);
            //if(this.isInterrupted()) {
            if(Thread.interrupted()) {
                System.out.println("thread stop");
                break;
            }
        }
    }

}
