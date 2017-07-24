package design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态代理实现日志输出
 */
public class LogHandler implements InvocationHandler {

    private Object obj;

    public LogHandler(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志开始......");
        //System.out.println("method = " + method.getName());
        method.invoke(obj);
        System.out.println("日志结束.......");
        return null;
    }
}
