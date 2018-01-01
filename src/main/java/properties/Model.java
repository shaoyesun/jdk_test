package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by Administrator on 2018/1/1.
 */
public class Model {
    public static void main(String[] args) {
        Properties pro = new Properties();

        //向properties中写入数据
        /*pro.setProperty("book", "com.test.book");
        pro.setProperty("test", "com.test.pro");
        try {
            pro.store(new FileOutputStream(new File("info.properties")), "配置文件");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //从properties中读取数据
        /*try {
            pro.load(new FileInputStream(new File("info.properties")));
            System.out.println(pro.getProperty("book"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //利用ResourceBundle直接读取classes下的文件
        ResourceBundle rb = ResourceBundle.getBundle("info");
        System.out.println(rb.getString("book"));

    }
}
