package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 17-8-1.
 */
public class StringTest {
    public static void main(String[] args) {

    }

    //字符串hash值及字符串对象手动放入常量池学习
    public static void hashAndIntern() {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println("s1 = " + s1.hashCode());//拥有相同值的字符串，hash值相等，因为hash值是通过值计算的
        System.out.println("s2 = " + s2.hashCode());
        System.out.println(s1 == s2);

        String s3 = "abc";//此时的字符串为常量，在内存（常量池）中独一份
        String s4 = "abc";
        System.out.println(s3 == s4);//true

        //intern()方法，将字符串对象从堆中放入常量池中
        s1 = s1.intern();//如果此时常量池中存在该字符串则返回引用，否则在常量池中创建该值返回引用
        s2 = s2.intern();
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//true
    }

    //常见面试题
    public static void interview() {
        //统计字符出现次数
        String str6 = "abcd统计字符出现次数abcd统计字符出现次数";
        Map<String, Integer> map = new HashMap();
        for(int i = 0; i < str6.length(); i++) {
            String key = String.valueOf(str6.charAt(i));
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println("5、统计字符出现次数：" + map);

        //比较两个字符串
        String str4 = "abcd";
        String str5 = "bcde";
        System.out.println("4、比较两个字符串：" + str4.compareTo(str5));

        //字符串大小写转换
        String str3 = "abcd";
        System.out.println("3、字符串大小写转换：" + str3.toUpperCase());

        //判断字符串是否对称
        String str2 = "abcdeedcba";
        String index = new StringBuffer(str2).reverse().toString();
        System.out.println("2、判断字符串是否对称，利用StringBuffer的reverse：" + str2.equals(index));
        boolean b = true;
        for(int i = 0; i < str2.length()/2; i++) {
            //System.out.println(str2.charAt(i));
            if(str2.charAt(i) != str2.charAt(str2.length() -1 - i)) {
                b = false;
                break;
            }
        }
        System.out.println("2、判断字符串是否对称，字符串两边查找对比：" + b);

        //删除字符串中制定字符
        String str1 = "abcdabcdabcd";
        System.out.println("1、字符串中删除a字符：" + str1.replace(Character.toString('a'), ""));
    }

}
