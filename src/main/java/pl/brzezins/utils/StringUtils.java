package pl.brzezins.utils;

public class StringUtils {
    public static String repeat(String input, int times) {
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= times; i++) {
            output.append(input);
        }

        return output.toString();
    }
}
