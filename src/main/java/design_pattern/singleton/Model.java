package design_pattern.singleton;

import design_pattern.singleton.ehan.EhanSingleton;
import design_pattern.singleton.lanhan.LanhanSingleton;

/**
 * Created by Administrator on 2017/3/21.
 */
public class Model {
    public static void main(String[] args) {
        EhanSingleton e1 = EhanSingleton.getInstance();
        EhanSingleton e2 = EhanSingleton.getInstance();
        System.out.println(e1 == e2);//true，结果显示e1、e2为同一实例

        LanhanSingleton l1 = LanhanSingleton.getInstance();
        LanhanSingleton l2 = LanhanSingleton.getInstance();
        System.out.println(l1 == l2);//true，结果显示l1、l2为同一实例
    }
}
