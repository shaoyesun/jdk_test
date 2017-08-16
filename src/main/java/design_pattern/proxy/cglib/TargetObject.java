package design_pattern.proxy.cglib;

/**
 * 被代理类
 */
public class TargetObject {

    public String method1(String paramName) {
        System.out.println("method1 " + paramName);
        return paramName;
    }

    @Override
    public String toString() {
        return "TargetObject []"+ getClass();
    }

}
