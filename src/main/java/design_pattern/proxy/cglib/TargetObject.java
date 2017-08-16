package design_pattern.proxy.cglib;

/**
 * Created by root on 17-8-16.
 */
public class TargetObject {

    public String method1(String paramName) {
        System.out.println("method1 " + paramName);
        return paramName;
    }

    public int method2(int count) {
        return count;
    }

    public int method3(int count) {
        return count;
    }

    @Override
    public String toString() {
        return "TargetObject []"+ getClass();
    }

}
