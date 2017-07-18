package design_pattern.proxy.static_proxy.aggregate;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/12.
 */
public class CarPropxy extends MoveImpl {

    private MoveImpl car;

    public CarPropxy(MoveImpl car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("汽车开始运行......");
        long start_time = new Date().getTime();
        car.move();
        long end_time = new Date().getTime();
        System.out.println("汽车结束运行,运行时间：" + (end_time - start_time));
    }
}
