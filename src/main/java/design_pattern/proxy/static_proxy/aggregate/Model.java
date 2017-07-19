package design_pattern.proxy.static_proxy.aggregate;


/**
 * 使用聚合实现静态代理
 */
public class Model {
    public static void main(String[] args) {
        //推荐使用聚合实现动态代理，这样可以方便实现多个代理顺序交换，方便扩展，如下
        MoveImpl moveProxy = new MoveImpl();
        CarProxy carPropxy = new CarProxy(moveProxy);
        LogProxy logProxy = new LogProxy(carPropxy);
        logProxy.move();

        System.out.println();
        MoveImpl moveProxy1 = new MoveImpl();
        CarProxy carPropxy1 = new CarProxy(moveProxy1);
        LogProxy logProxy1 = new LogProxy(carPropxy1);
        logProxy1.move();
    }
}
