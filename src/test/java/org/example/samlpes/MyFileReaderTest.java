package org.example.samlpes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

class MyFileReaderTest {

    @Test
    void readToString() {
        String actual = MyFileReader.readToString( new File("test1.txt"));
        String expected = "test1\r\ntest2\r\n";
        Assertions.assertEquals(expected, actual);
    }
}