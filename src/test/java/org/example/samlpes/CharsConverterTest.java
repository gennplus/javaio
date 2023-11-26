package org.example.samlpes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CharsConverterTest {

    @Test
    void charToString() {
        String actual = CharsConverter.charToString(new char[] {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'});
        String expected = "Hello world";
        Assertions.assertEquals(expected, actual);
    }
}