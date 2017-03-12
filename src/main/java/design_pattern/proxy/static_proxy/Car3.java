package design_pattern.proxy.static_proxy;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/12.
 */
public class Car3 extends CarMoveProxy {

    private CarMoveProxy car;

    public Car3(CarMoveProxy car) {
        this.car = car;
    }

    @Override
    public void move() {
        long start_time = new Date().getTime();
        System.out.println("汽车开始运行......");
        car.move();
        long end_time = new Date().getTime();
        System.out.println("汽车结束运行,运行时间：" + (end_time - start_time));
    }
}
