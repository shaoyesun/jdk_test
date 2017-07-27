package collection;

import java.util.*;

/**
 * Created by Administrator on 2017/7/26.
 */
public class LinkListTest {
    public static void main(String[] args) {
        //removeE();
        removeAndSort();
    }

    //可以通过Iterator的remove过滤掉我们不需要的数据，如果用list本身的remove方法就会报错
    public static void removeE(){
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer o = Integer.parseInt(it.next() + "");
            if(o == 3) it.remove();
        }
        for(Object o : list) System.out.println(o);
    }

    //去重并排序
    public static void removeAndSort(){
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        Collections.sort(list);
        for(Object o : list) System.out.print(o + " ");
        Set s = new HashSet(list);
        System.out.println();
        for(Object o : s) System.out.print(o + " ");
    }

}
