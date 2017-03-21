package design_pattern.factory;

/**
 * Created by Administrator on 2017/3/21.
 */
public class test {
    public static void main(String[] args) {
        AnimalFactory af = new AnimalFactory();
        Animal a = af.getAnimalByClassName("design_pattern.factory.Cat");
        a.eat();
        a = af.getAnimalByClassName("design_pattern.factory.Dog");
        a.eat();
    }
}
