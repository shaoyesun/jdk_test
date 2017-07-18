package design_pattern.proxy.static_proxy.inheriting;

/**
 * 通过继承实现代理
 */
public class Model {
    public static void main(String[] args) {
        CarProxy carProxy = new CarProxy();
        carProxy.move();
    }
}
