package thread.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * Created by root on 17-5-4.
 */
public class ReadData {
    public void readByte(PipedInputStream in) {
        try {
            System.out.println(Thread.currentThread().getName()+" : read start");
            byte[] b = new byte[30];
            int len = in.read(b);
            while (len != -1) {
                System.out.println(new String(b, 0, len));
                len = in.read(b);
            }
            System.out.println(Thread.currentThread().getName()+" : read end");
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readChar(PipedReader reader) {
        try {
            System.out.println(Thread.currentThread().getName()+" : read start");
            char[] b = new char[30];
            int len = reader.read(b);
            while (len != -1) {
                System.out.println(new String(b, 0, len));
                len = reader.read(b);
            }
            System.out.println(Thread.currentThread().getName()+" : read end");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
