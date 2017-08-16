package design_pattern.proxy.cglib;

import net.sf.cglib.proxy.FixedValue;

/**
 * 表示锁定方法返回值，无论被代理类的方法返回什么值，回调方法都返回固定值
 */
public class TargetResultFixed implements FixedValue {
    public Object loadObject() throws Exception {
        System.out.println("锁定结果");
        Object obj = 999;
        return obj;
    }
}
