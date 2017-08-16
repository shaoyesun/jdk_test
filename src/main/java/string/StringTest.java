package string;

import java.util.Arrays;

/**
 * Created by root on 17-8-1.
 */
public class StringTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("stringbuffer");
        String s = "string";

        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = Arrays.copyOf(a, 6);
        System.out.println(c);
    }
}
