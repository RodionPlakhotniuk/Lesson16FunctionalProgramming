package app;

import java.util.Random;

public class RandomNumberGenerator {
    private static final Random random = new Random();

    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("мінімальне значення не може бути більше максимального");
        }
        int range = max - min + 1;
        return random.nextInt(range) + min;
    }
}
