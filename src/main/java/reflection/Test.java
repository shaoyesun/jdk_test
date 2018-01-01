package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by root on 17-6-17.
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Class.forName("reflection.Model");

        //通过无参构造实例化
        Object obj = clazz.newInstance();
        System.out.println(obj.getClass());

        //通过有参构造实例化，借助Constructor
        Constructor con = clazz.getConstructor(String.class);
        obj = con.newInstance("constructorName");

        //方法调用
        Method method = clazz.getMethod("setName", String.class);
        method.invoke(obj,"setName");

        /*Method[] methods = clazz.getMethods();
        for(Method method1 : methods) {
            System.out.print(method1.getName());
            System.out.print(" | " + method1.getReturnType());
            Class[] clazzs = method1.getParameterTypes();
            for(Class c : clazzs) System.out.print(" | " + c.getName());
            System.out.println();
        }*/
    }

}
