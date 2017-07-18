package design_pattern.proxy.static_proxy.aggregate;

/**
 * Created by Administrator on 2017/3/12.
 */
public class LogProxy implements Move {

    private Move obj;

    public LogProxy(Move obj) {
        this.obj = obj;
    }

    public void move() {
        System.out.println("日志开始......");
        obj.move();
        System.out.println("日志结束......");
    }
}
