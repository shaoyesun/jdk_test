package string;

import org.apache.tools.ant.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 17-8-1.
 */
public class StringTest {
    public static void main(String[] args) {
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
