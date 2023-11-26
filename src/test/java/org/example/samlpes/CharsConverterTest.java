package org.example.samlpes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CharsConverterTest {

    @Test
    void charToString() {
        String actual = CharsConverter.charToString(new char[] {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'});
        String expected = "Hello world";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void charToStrings() {
        List<String> actual = CharsConverter.charToListOfStrings("test1\r\ntest2\r\n".toCharArray());
        List<String> expected = Arrays.asList("test1", "test2");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void charToArrayOfStrings() {
        String[] actual = CharsConverter.charToArrayOfStrings("test1\r\ntest2\r\n".toCharArray());
        String[] expected = new String[] {"test1", "test2"};
        Assertions.assertArrayEquals(expected, actual);
    }
}