package design_pattern.factory;

/**
 * @要点：
 * @ 1.一个接口或抽象类
 * @ 2.一个工厂类，用反射实例化对象
 * @ 3.实例化对象类
 */
public class Model {
    public static void main(String[] args) {
        AnimalFactory af = new AnimalFactory();
        Animal a = af.getAnimalByClassName("design_pattern.factory.Cat");
        a.eat();
        a = af.getAnimalByClassName("design_pattern.factory.Dog");
        a.eat();
    }
}
