package thread.piped;

import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * Created by root on 17-5-4.
 */
public class ReadThread extends Thread {

    private ReadData readData;
    private PipedInputStream inputStream;
    private PipedReader reader;

    public ReadThread(ReadData readData, PipedInputStream inputStream) {
        this.readData = readData;
        this.inputStream = inputStream;
    }

    public ReadThread(ReadData readData, PipedReader reader) {
        this.readData = readData;
        this.reader = reader;
    }

    @Override
    public void run() {
        //readData.readByte(inputStream);
        readData.readChar(reader);
    }
}
