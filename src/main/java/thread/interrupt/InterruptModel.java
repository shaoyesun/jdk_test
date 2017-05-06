package thread.interrupt;

/**
 * Created by root on 17-5-5.
 */
public class InterruptModel {
    public static void main(String[] args) {
        InterruptThread thread = new InterruptThread();
        thread.start();

        /*Thread.currentThread().interrupt();
        System.out.println("is stop 1 ? " + Thread.interrupted());
        System.out.println("is stop 2 ? " + Thread.interrupted());*/

        thread.interrupt();
        System.out.println("is stop 1 ? " + thread.isInterrupted());
        System.out.println("end");

        A a = new A();
        a.add();
    }

    public static void add(){
        System.out.println("add");
    }

}

class A extends InterruptModel{

}
