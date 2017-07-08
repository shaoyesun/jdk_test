package design_pattern.template;

/**
 * Created by Administrator on 2017/7/8.
 */
public class Tea extends RefreshTemplate {
    protected void brew() {
        System.out.println("用开水浸泡5分钟");
    }

    protected void addCondiments() {
        System.out.println("加入柠檬");
    }
}
