package org.example.samlpes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;

public class MyFileReader {

    // N.B. for some reason CRLF is added to the end of file.
    public static String readToString(File file) {
        String content = "";
        try {
            // option 1
            // content = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);

            // option 2 (preferred by IntelliJ)
            content = Files.readString(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static List<String> readToListOfStrings(File file) {
        List<String> content = new LinkedList<>();
        try {
            content = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
