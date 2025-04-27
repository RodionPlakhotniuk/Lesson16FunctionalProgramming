package app;

public class StringListProcessor {
    public static int countUppercase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if (Character.isUpperCase(k)) {
                count++;
            }
        }
        return count;
    }
}
