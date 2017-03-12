package design_pattern.proxy.static_proxy;


/**
 * Created by Administrator on 2017/3/12.
 */
public class Client {
    public static void main(String[] args) {
        //利用继承实现静态代理
        /*Car1 car1 = new Car1();
        car1.move();*/

        //利用聚合实现静态代理
        /*Car3 car3 = new Car3(new CarMoveProxy());
        car3.move();*/

        //推荐使用聚合实现动态代理，这样可以方便实现多个代理顺序交换，方便扩展，如下
        CarMoveProxy car = new CarMoveProxy();
        TimeProxy t = new TimeProxy(car);
        LogProxy l = new LogProxy(t);
        l.move();

        System.out.println();
        CarMoveProxy car1 = new CarMoveProxy();
        LogProxy l1 = new LogProxy(car1);
        TimeProxy t1 = new TimeProxy(l1);
        t1.move();
    }
}
