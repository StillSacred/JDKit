import java.io.FileNotFoundException;
import java.io.IOException;

public interface Logger {

    void writeLog(String text) throws FileNotFoundException;

    String readLog() throws IOException;
}