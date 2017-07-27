package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by Administrator on 2017/7/26.
 */
public class VectorTest {
    public static void main(String[] args) {
        vectorCollection();
    }

    //list转vector,这些元素按其 collection 的迭代器返回元素的顺序排列
    public static void vectorCollection() {
        List list = new ArrayList();
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(1);
        list.add(7);
        Vector v = new Vector(list);
        for(Object o : v) System.out.println(o);
    }

}
