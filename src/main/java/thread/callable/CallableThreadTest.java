package thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2017/8/12.
 */
public class CallableThreadTest implements Callable<Integer> {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThreadTest ctt = new CallableThreadTest();
        FutureTask<Integer> ft = new FutureTask<Integer>(ctt);
//        Thread thread = new Thread(ft,"有返回值的线程");
//        thread.start();
        for (int i = 0; i < 100; i++) {
            //System.out.println(Thread.currentThread().getName() + " 循环变量" + i);
            if (i == 20) {
                new Thread(ft, Thread.currentThread().getName() + "有返回值的线程").start();
            }
        }
       // System.out.println(Thread.currentThread().getName() + "子线程：" + ft.get());
    }

    public Integer call() throws Exception {
        int i = 0;
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }
}
