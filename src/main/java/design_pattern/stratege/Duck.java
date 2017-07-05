package design_pattern.stratege;

/**
 * Created by Administrator on 2017/7/5.
 */
public abstract class Duck {

    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    public abstract void display();

    private SwimmingStratege swimmingStratege;

    public void setSwimmingStratege(SwimmingStratege swimmingStratege) {
        this.swimmingStratege = swimmingStratege;
    }

    public void swimming() {
        swimmingStratege.swimming();
    }
}
