import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ChatLogger implements Logger{

    private File chatLog;

    public ChatLogger(String path) throws IOException {
        chatLog = new File(path);
        if (!chatLog.exists()) {
            this.chatLog.createNewFile();
        }
    }

    @Override
    public void writeLog(String text) {
        String log = readLog();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(chatLog))) {
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String readLog() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(chatLog))) {
            List<String> lines = bufferedReader.lines().toList();
            StringBuilder stringBuilder = new StringBuilder();
            for (String line : lines) {
                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}