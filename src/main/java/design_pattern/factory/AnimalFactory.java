package design_pattern.factory;

/**
 * Created by Administrator on 2017/3/21.
 */
public class AnimalFactory {
    public Animal getAnimalByClassName(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Animal) Class.forName(className).newInstance();
    }
}
