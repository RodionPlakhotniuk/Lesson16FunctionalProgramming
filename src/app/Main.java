package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1:");
        MathOperation mathOperation = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        int sum = mathOperation.operate(8, 8);
        System.out.println("Результат додавання(mathOperation): " + sum + "\n");

        System.out.println("Завдання 2:");
        StringManipulator stringManipulator = string -> string.toUpperCase();

        String stringNoChanges = "i love java";
        String stringToUpperCase = stringManipulator.manipulate(stringNoChanges);
        System.out.println("Рядок у верхньому регістрі(StringManipulator):" + stringToUpperCase + "\n");

        System.out.println("Завдання 3:");
        Function<String, Integer> stringListProcessor = StringListProcessor::countUppercase;

        String exampleStr = "JAVA The BeSt";
        int uppercaseCount = stringListProcessor.apply(exampleStr);
        System.out.println("Кількість великих літер(StringListProcessor) " + uppercaseCount + "\n");

        //Декілька спроб, для перевірки.
        System.out.println("Завдання 4:");
        Supplier<Integer> randomNumberGenerator = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Випадкове число в діапазоні від 1 до 100(RandomNumberGenerator):" + randomNumberGenerator.get());
        System.out.println("Випадкове число в діапазоні від 1 до 100(RandomNumberGenerator):" + randomNumberGenerator.get());

    }
}
