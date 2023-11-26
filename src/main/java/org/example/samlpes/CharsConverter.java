package org.example.samlpes;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CharsConverter {
    private CharsConverter() throws IllegalAccessException {
        throw new IllegalAccessException(String
                .format("Service class %s could not be instantiated", this.getClass().getName()));
    }

    public static String charToString(char[] chars) {
        // Option 1:
        // StringBuilder stringBuilder = new StringBuilder().append(chars);
        // return stringBuilder.toString();

        // Option 2, preferred by IntelliJ:
        return String.valueOf(chars);
    }

    public static List<String> charToStrings(char[] chars) {
        BufferedReader br = new BufferedReader(new CharArrayReader(chars));

        List<String> content = new ArrayList<>();
        String line;
        try {
            while ((line = br.readLine()) != null) {
                content.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return content;
    }
}
