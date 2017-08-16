package design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * 示例jdk动态代理迭代使用
 *
 * @ JDK中的动态代理是通过反射类Proxy以及InvocationHandler回调接口实现的，
 * @ JDK中所要进行动态代理的类必须要实现一个接口，也就是说只能对该类所实现接口中定义的方法进行代理，
 * @ 这在实际编程中具有一定的局限性，而且使用反射的效率也并不是很高。
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
