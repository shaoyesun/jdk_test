package design_pattern.singleton.lanhan;

/**
 * Created by Administrator on 2017/3/21.
 */
public class LanhanSingleton {

    //定义私有无参构造，防止通过new方式获取类实例
    private LanhanSingleton(){
    }

    //声明类的唯一实例
    private static LanhanSingleton lanhanSingleton;

    //提供用于获取实例的方法,当第一次获取时创建实例，所以称为懒汉模式
    public static LanhanSingleton getInstance(){
        if(lanhanSingleton == null) lanhanSingleton = new LanhanSingleton();
        return lanhanSingleton;
    }
}
