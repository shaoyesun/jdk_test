package design_pattern.singleton.ehan;

/**
 * Created by Administrator on 2017/3/21.
 */
public class EhanSingleton {

    //定义私有无参构造，防止通过new方式获取类实例
    private EhanSingleton(){
    }

    //创建类的唯一实例，使用private、static修饰，保证类加载及创建实例，所以称为饿汉模式
    private static EhanSingleton ehanSingleton = new EhanSingleton();

    //提供用于获取实例的方法
    public static EhanSingleton getInstance(){
        return ehanSingleton;
    }
}
