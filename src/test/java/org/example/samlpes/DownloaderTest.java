package org.example.samlpes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

class DownloaderTest {

    private static final String TEST_FILE1_URL = "https://raw.githubusercontent.com/gennplus/javaio/master/test1.txt";
    private static final String TEST_FILE2_URL = "https://raw.githubusercontent.com/gennplus/javaio/master/test1.txt";

    @Test
    void readFileAsString_caseCrLfEnded() {
        try {
            String actual = Downloader.readFileAsString(TEST_FILE1_URL);
            String expected = "test1\ntest2\n";
            Assertions.assertEquals(expected, actual);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void readFileAsString_caseVisibleSymbolEnded() {
        try {
            String actual = Downloader.readFileAsString(TEST_FILE2_URL);
            String expected = "test1\ntest2\n";
            Assertions.assertEquals(expected, actual);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void readFile_caseCrLfEnded() {
        try {
            List<String> actual = Downloader.readFile(TEST_FILE1_URL);
            List<String> expected = Arrays.asList("test1", "test2");
            Assertions.assertEquals(actual, expected);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void downloadFileAndSave_caseCrLfEnded() {
        try {
            Downloader.downloadFileAndSave(TEST_FILE1_URL, "mytest.txt");
            String actual = new String(Files.readAllBytes(Paths.get("mytest.txt")));
            String expected = "test1\ntest2\n";

            Assertions.assertEquals(expected, actual);
            Assertions.assertTrue(new File("mytest.txt").isFile());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}