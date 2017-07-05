package design_pattern.stratege;

import design_pattern.stratege.swimming.SwimmingWithFoot;

/**
 * Created by Administrator on 2017/7/5.
 */
public class RealDuck extends Duck {

    public RealDuck() {
        super();
        super.setSwimmingStratege(new SwimmingWithFoot());
    }

    @Override
    public void quack() {
        super.quack();
    }

    public void display() {
        System.out.println("我是真的鸭子");
    }
}
