package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by Administrator on 2017/7/27.
 */
public class MapTest {
    public static void main(String[] args) {
        ConcurrentMap cmap = new ConcurrentHashMap();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);

        //通过Map的Entry接口
        for(Map.Entry entry : map.entrySet()) System.out.print(entry.getKey() + " = " + entry.getValue() + ";");

        System.out.println();
        for(String s : map.keySet()) System.out.print(s + " ");

        System.out.println();
        for(Object o : map.values()) System.out.print(o + " ");

        System.out.println();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> entry = (Map.Entry<String, Object>) it.next();
            System.out.print(entry.getKey() + " = " + entry.getValue() + ";");
        }

    }
}
