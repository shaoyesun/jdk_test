package design_pattern.factory;

/**
 * Created by Administrator on 2017/3/21.
 */
public class AnimalFactory {
    public Animal getAnimalByClassName(String className) {
        Animal a = null;
        try {
            a = (Animal) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return a;
    }
}
