package design_pattern.template;

/**
 * Created by Administrator on 2017/7/8.
 */
public abstract class RefreshTemplate {

    public final void refresh() {
        //将水煮沸
        biolWater();
        //炮制饮料
        brew();
        //将饮料倒入杯中
        pourInCup();
        //加入调味料
        addCondiments();

    }

    private void biolWater() {
        System.out.println("将水煮沸");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("将饮料倒入杯中");
    }

    protected abstract void addCondiments();

}
