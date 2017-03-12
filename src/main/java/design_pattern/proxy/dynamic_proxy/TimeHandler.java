package design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * jdk动态代理实现时间输出
 */
public class TimeHandler implements InvocationHandler {

    private Object obj;

    public TimeHandler(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start_time = new Date().getTime();
        System.out.println("汽车开始运行......");
        method.invoke(obj);
        long end_time = new Date().getTime();
        System.out.println("汽车结束运行,运行时间：" + (end_time - start_time));
        return null;
    }
}
