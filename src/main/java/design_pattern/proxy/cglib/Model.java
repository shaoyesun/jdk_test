package design_pattern.proxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * 示例cglib动态代理
 *
 * @ 1.使用CGLib实现动态代理，完全不受代理类必须实现接口的限制，
 * @ 2.而且CGLib底层采用ASM字节码生成框架，使用字节码技术生成代理类，比使用Java反射效率要高。
 * @ 3.唯一需要注意的是，CGLib不能对声明为final的方法进行代理，因为CGLib原理是动态生成被代理类的子类
 * @ 4.在CGLib回调时可以设置对不同方法执行不同的回调逻辑，或者根本不执行回调,在JDK动态代理中并没有类似的功能
 */
public class Model {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();//CGLib中的一个字节码增强器，它可以方便的对你想要处理的类进行扩展
        enhancer.setSuperclass(TargetObject.class);
        enhancer.setCallback(new TargetInterceptor1());
        enhancer.setCallback(new TargetInterceptor2());
        //System.out.println(to.toString());
        //to.method1("cglib");

        /**
         * 1.callback1：方法拦截器
         * 2.NoOp.INSTANCE：这个NoOp表示no operator，即什么操作也不做，代理类直接调用被代理的方法不进行拦截。
         * 3.FixedValue：表示锁定方法返回值，无论被代理类的方法返回什么值，回调方法都返回固定值。
         */
        CallbackFilter callbackFilter = new TargetMethodCallbackFilter();

        //此时使用代理
        Callback callback1 = new TargetInterceptor1();

        //此时不使用代理
        Callback noopCb = NoOp.INSTANCE;

        //此时目标方法不会被调用，而是直接调用TargetResultFixed的loadObject,表示锁定方法返回值，无论被代理类的方法返回什么值，回调方法都返回固定值
        Callback fixedValue = new TargetResultFixed();

        //TargetMethodCallbackFilter中的返回值对应数组下标
        Callback callback2 = new TargetInterceptor2();//此时使用代理

        //保存过滤处理,TargetMethodCallbackFilter的返回值对应该数组下标,数组中的值即为对应方法的处理逻辑
        Callback[] cbarray = new Callback[]{callback1, noopCb, fixedValue, callback2};

        enhancer.setCallbackFilter(callbackFilter);
        enhancer.setCallbacks(cbarray);

        TargetObject to = (TargetObject) enhancer.create();
        to.method1("mmm1");
        to.method2(100);
        to.method3(100);
        to.method3(200);
        to.method4("mmm4");
    }
}
