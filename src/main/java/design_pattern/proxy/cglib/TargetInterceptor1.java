package design_pattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib通过MethodInterceptor接口生成代理
 */
public class TargetInterceptor1 implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] params, MethodProxy methodProxy) throws Throwable {
        System.out.println("TargetInterceptor1:调用前");
        Object result = methodProxy.invokeSuper(o, params);
        System.out.println("TargetInterceptor1:调用后");
        return result;
    }
}
