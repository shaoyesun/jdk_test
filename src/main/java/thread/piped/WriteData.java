package thread.piped;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * Created by root on 17-5-4.
 */
public class WriteData {
    public void writeByte(PipedOutputStream out) {
        try {
            System.out.println(Thread.currentThread().getName()+" : write start");
            /*for (int i = 0; i < 50; i++) {
                out.write(((i+1)+"").getBytes());
            }*/
            out.write("PipedOutputStream test thread".getBytes());
            System.out.println(Thread.currentThread().getName()+" : write end");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeChar(PipedWriter writer) {
        try {
            System.out.println(Thread.currentThread().getName()+" : write start");
            writer.write("传送的字符输出流");
            System.out.println(Thread.currentThread().getName()+" : write end");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
