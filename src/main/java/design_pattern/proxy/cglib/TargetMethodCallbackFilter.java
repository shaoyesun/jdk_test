package design_pattern.proxy.cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * 回调方法过滤
 */
public class TargetMethodCallbackFilter implements CallbackFilter {

    /**
     * @ 1.返回的值为数字，代表了Callback数组中的索引位置，要调用的Callback。
     * @ 2.其中return值为被代理类的各个方法在回调数组Callback[]中的位置索引。
     */
    public int accept(Method method) {
        if (method.getName().equals("method1")) {
            System.out.println("filter method1 == 0");
            return 0;
        }
        if (method.getName().equals("method2")) {
            System.out.println("filter method2 == 1");
            return 1;
        }
        if (method.getName().equals("method3")) {
            System.out.println("filter method3 == 2");
            return 2;
        }
        if (method.getName().equals("method4")) {
            System.out.println("filter method3 == 3");
            return 3;
        }
        return 0;
    }
}
