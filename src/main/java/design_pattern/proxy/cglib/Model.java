package design_pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * 示例cglib动态代理
 *
 * @ 使用CGLib实现动态代理，完全不受代理类必须实现接口的限制，
 * @ 而且CGLib底层采用ASM字节码生成框架，使用字节码技术生成代理类，比使用Java反射效率要高。
 * @ 唯一需要注意的是，CGLib不能对声明为final的方法进行代理，因为CGLib原理是动态生成被代理类的子类
 */
public class Model {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetObject.class);
        enhancer.setCallback(new TargetInterceptor());
        TargetObject to = (TargetObject) enhancer.create();
        //System.out.println(to.toString());
        to.method1("cglib");
    }
}
