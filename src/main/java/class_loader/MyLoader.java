package class_loader;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2018/1/9.
 */
public class MyLoader extends ClassLoader {

    public Class<?> getLoader(String name) {
        byte[] bytes = null;
        try {
            bytes = loadClassFile(name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.defineClass(name, bytes, 0, bytes.length);
    }

    //读取.class文件
    public byte[] loadClassFile(String name) throws Exception {
        String fileName = name.substring(name.lastIndexOf(".") + 1, name.length()) + ".class";
        String path = "D:" + File.separator + fileName;
        InputStream input = new FileInputStream(new File(path));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = input.read(bytes)) != -1) {
            baos.write(bytes, 0, len);
        }
        input.close();
        baos.close();
        return baos.toByteArray();
    }

    //加载网络.class文件
    public byte[] loadClassFileByNet(String name) throws Exception {
        String fileName = name.substring(name.lastIndexOf(".") + 1, name.length()) + ".class";
        URL url = new URL("http://localhost/" + fileName);
        URLConnection con = url.openConnection();
        InputStream input = con.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = input.read(bytes)) != -1) {
            baos.write(bytes, 0, len);
        }
        return baos.toByteArray();
    }

}
