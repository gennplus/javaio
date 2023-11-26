package org.example.samlpes;

import java.io.*;
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

    public static String[] readToArrayOfStrings(File file) {
        List<String> lines = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lines.toArray(new String[0]);
    }

}
