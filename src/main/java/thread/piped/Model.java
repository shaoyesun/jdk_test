package thread.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Created by root on 17-5-4.
 */
public class Model {
    public static void main(String[] args) {
        try {
            /*PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream();
            //inputStream.connect(outputStream);
            outputStream.connect(inputStream);

            WriteThread writeThread = new WriteThread(new WriteData(), outputStream);
            writeThread.setName("out");
            writeThread.start();
            ReadThread readThread = new ReadThread(new ReadData(), inputStream);
            readThread.setName("in");
            readThread.start();*/

            PipedWriter writer = new PipedWriter();
            PipedReader reader = new PipedReader();
            writer.connect(reader);
            WriteThread writeThread1 = new WriteThread(new WriteData(), writer);
            writeThread1.setName("writer");
            writeThread1.start();
            ReadThread readThread1 = new ReadThread(new ReadData(), reader);
            readThread1.setName("reader");
            readThread1.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
