package design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * 测试jdk动态代理迭代使用
 */
public class Model {
    public static void main(String[] args) {
        MoveImpl move = new MoveImpl();
        Class c = move.getClass();

        TimeHandler t = new TimeHandler(move);
        Move m = (Move) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), t);
        LogHandler l = new LogHandler(m);
        Move m1 = (Move) Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), l);
        m1.move();
    }
}
