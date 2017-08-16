package design_pattern.proxy.cglib;

/**
 * 被代理类
 */
public class TargetObject {

    public String method1(String paramName) {
        System.out.println("method1 " + paramName);
        return paramName;
    }

    public int method2(int count) {
        System.out.println("method2 " + count);
        return count;
    }

    public int method3(int count) {
        System.out.println("method3 " + count);
        return count;
    }

    public String method4(String paramName) {
        System.out.println("method4 " + paramName);
        return paramName;
    }

    @Override
    public String toString() {
        return "TargetObject []"+ getClass();
    }

}
