package design_pattern.stratege;

/**
 *   @ 策略模式中有三个对象
 *   @ 环境对象(Context)：该类中实现了对抽象策略中定义的接口或者抽象类的引用。
 *   @ 抽象策略对象(Strategy)：它可由接口或抽象类来实现。
 *   @ 具体策略对象(ConcreteStrategy)：它封装了实现同不功能的不同算法
 */
public class DuckModel {

    public static void main(String[] args) {
        Duck duck = new RealDuck();
//        Duck duck = new YellowDuck();
        duck.display();
        duck.quack();
        duck.swimming();
    }

}
