package class_loader;

/**
 * Created by Administrator on 2018/1/9.
 */
public class Model {
    public static void main(String[] args) throws Exception {
        MyLoader myLoader = new MyLoader();
        Class<?> clazz = myLoader.getLoader("class_loader.Book");
        System.out.println(clazz.newInstance());
    }
}
