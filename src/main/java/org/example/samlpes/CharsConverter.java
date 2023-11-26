package org.example.samlpes;

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

}
