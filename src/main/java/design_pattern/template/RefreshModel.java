package design_pattern.template;

/**
 * 抽象模版类和一个final模板方法
 *
 */
public class RefreshModel {

    public static void main(String[] args) {
        //RefreshTemplate refresh = new Coffee();
        RefreshTemplate refresh = new Tea();
        refresh.refresh();
    }

}
