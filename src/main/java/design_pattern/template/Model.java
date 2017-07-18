package design_pattern.template;

/**
 * 要点：抽象模版类和一个final模板方法
 */
public class Model {

    public static void main(String[] args) {
        //RefreshTemplate refresh = new Coffee();
        RefreshTemplate refresh = new Tea();
        refresh.refresh();
    }

}
