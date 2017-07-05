package design_pattern.stratege.swimming;

import design_pattern.stratege.SwimmingStratege;

/**
 * Created by Administrator on 2017/7/5.
 */
public class SwimmingWithFoot implements SwimmingStratege {
    public void swimming() {
        System.out.println("我借助脚滑动在水中游走");
    }
}
