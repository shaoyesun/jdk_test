package design_pattern.proxy.dynamic_proxy;

import design_pattern.proxy.static_proxy.CarMoveProxy;
import design_pattern.proxy.static_proxy.Moveable;

import java.lang.reflect.Proxy;

/**
 * 测试jdk动态代理迭代使用
 */
public class Test {
    public static void main(String[] args) {
        CarMoveProxy car = new CarMoveProxy();
        Class c = car.getClass();

        TimeHandler t = new TimeHandler(car);
        Moveable m = (Moveable) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), t);
        LogHandler l = new LogHandler(m);
        Moveable m1 = (Moveable) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), l);
        m1.move();
    }
}
