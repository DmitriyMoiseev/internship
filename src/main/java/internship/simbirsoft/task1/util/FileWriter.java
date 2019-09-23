package internship.simbirsoft.task1.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {

    public static void writeToFile(String text, String fileName) throws IOException {
        File file = new File(fileName + ".txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(text.getBytes());
        fileOutputStream.close();
    }

}
