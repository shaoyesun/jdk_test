package design_pattern.stratege;

/**
 * Created by Administrator on 2017/7/5.
 */
public class YellowDuck extends Duck {

    public YellowDuck() {
        super();
        super.setSwimmingStratege(new SwimmingWithWind());
    }

    @Override
    public void quack() {
        super.quack();
    }

    public void display() {
        System.out.println("我是大黄鸭");
    }

}
