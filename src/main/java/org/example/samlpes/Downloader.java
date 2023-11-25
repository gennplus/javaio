package org.example.samlpes;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Downloader {

    // N.B. last symbol is always CR LF as we append every time we read a string.
    public static String readFileAsString(String urlAsString) throws IOException {
        URL url = new URL(urlAsString);
        InputStream in = url.openStream();
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        StringBuilder content = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");
        }

        br.close();
        return content.toString();
    }

    public static List<String> readFile(String urlAsString) throws IOException {
        URL url = new URL(urlAsString);
        InputStream in = url.openStream();
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        List<String> content = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            content.add(line);
        }

        return content;
    }

    public static void downloadFileAndSave(String urlAsString, String newFileName) throws IOException {

        // Download the file from the URL to the file
        URL url = new URL(urlAsString);
        try (InputStream in = url.openStream();
            OutputStream out = new FileOutputStream(newFileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }
}
