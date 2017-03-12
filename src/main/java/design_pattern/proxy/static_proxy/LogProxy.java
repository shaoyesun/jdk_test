package design_pattern.proxy.static_proxy;

/**
 * Created by Administrator on 2017/3/12.
 */
public class LogProxy implements Moveable {

    private Moveable obj;

    public LogProxy(Moveable obj) {
        this.obj = obj;
    }

    public void move() {
        System.out.println("日志开始......");
        obj.move();
        System.out.println("日志结束......");
    }
}
