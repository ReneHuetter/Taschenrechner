import java.io.*;

public class SaveToFile {

    static String path = "C:\\Users\\BBRZ\\IdeaProjects\\Taschenrechner\\src\\ergebnis.txt";

    public static void saveToFile () {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
