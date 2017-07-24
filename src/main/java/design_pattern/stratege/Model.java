package design_pattern.stratege;

/**
 *   @适用于同一操作的不同行为,策略模式中有4个对象
 *   @ 1.环境对象(Context)：该类中实现了对抽象策略中定义的接口或者抽象类的引用。Duck
 *   @ 2.抽象策略对象(Strategy)：它可由接口或抽象类来实现。SwimmingStratege
 *   @ 3.具体策略对象(ConcreteStrategy)：它封装了实现同不功能的不同算法 SwimmingWithFoot
 *   @ 4.具体注入对象 YellowDuck
 */
public class Model {

    public static void main(String[] args) {
        Duck duck = new RealDuck();
//        Duck duck = new YellowDuck();
        duck.display();
        duck.quack();
        duck.swimming();
    }

}
