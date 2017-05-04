package thread.piped;

import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * Created by root on 17-5-4.
 */
public class WriteThread extends Thread {

    private WriteData writeData;
    private PipedOutputStream outputStream;
    private PipedWriter writer;

    public WriteThread(WriteData writeData, PipedOutputStream outputStream) {
        this.writeData = writeData;
        this.outputStream = outputStream;
    }

    public WriteThread(WriteData writeData, PipedWriter writer) {
        this.writeData = writeData;
        this.writer = writer;
    }

    @Override
    public void run() {
        //writeData.writeByte(outputStream);
        writeData.writeChar(writer);
    }
}
