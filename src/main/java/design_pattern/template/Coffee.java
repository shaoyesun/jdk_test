package design_pattern.template;

/**
 * Created by Administrator on 2017/7/8.
 */
public class Coffee extends RefreshTemplate {
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    protected void addCondiments() {
        System.out.println("向咖啡中加入牛奶和糖");
    }
}
