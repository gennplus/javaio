package org.example.samlpes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

class MyFileReaderTest {

    @Test
    void readToString() {
        String actual = MyFileReader.readToString( new File("test1.txt"));
        String expected = "test1\r\ntest2\r\n";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void readToListOfStrings() {
        List<String> actual = MyFileReader.readToListOfStrings( new File("test1.txt"));
        List<String> expected = Arrays.asList("test1", "test2");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void readToArrayOfStrings() {
        String[] actual = MyFileReader.readToArrayOfStrings(new File("test1.txt"));
        String[] expected = new String[]{"test1", "test2"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void readToArrayOfChars() {
        char[] actual = MyFileReader.readToArrayOfChars(new File("test1.txt"));
        char[] expected = "test1\r\ntest2\r\n".toCharArray();
        Assertions.assertArrayEquals(actual, expected);
    }
}