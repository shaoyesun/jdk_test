package design_pattern.proxy.static_proxy;

/**
 * Created by Administrator on 2017/3/12.
 */
public class CarMoveProxy implements Moveable {
    public void move() {
        System.out.println("汽车正在运行......");
    }
}
