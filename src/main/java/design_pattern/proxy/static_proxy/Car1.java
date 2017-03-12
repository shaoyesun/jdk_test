package design_pattern.proxy.static_proxy;

import java.util.Date;

/**
 * 利用继承实现静态代理
 */
public class Car1 extends CarMoveProxy {
    @Override
    public void move() {
        long start_time = new Date().getTime();
        System.out.println("汽车开始运行......");
        super.move();
        long end_time = new Date().getTime();
        System.out.println("汽车结束运行,运行时间：" + (end_time - start_time));
    }
}
