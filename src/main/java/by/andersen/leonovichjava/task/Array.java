package by.andersen.leonovichjava.task;

import java.util.Scanner;

//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
public class Array {
    private static final String INITIAL_MESSAGE = "Введите набор целых чисел через запятую >>> (Пример: 12, 123, 123, 432, 342)";
    private static final String ERROR_MESSAGE = "Что-то пошло не так, проверьте ввод и перезапустите программу!";
    private static final String COMMA = ",";
    private static final int ERROR_EXIT_CODE = 1;

    public static void main(String[] args) {
        System.out.println(INITIAL_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] intArray = fromStringToIntArray(input);
        printElementsMultipleOfThree(intArray);
    }

    public static int[] fromStringToIntArray(String str) {
        String[] integers = str.split(COMMA);
        int[] result = new int[integers.length];
        for (int i = 0; i < integers.length; i++) {
            try {
                result[i] = Integer.parseInt(integers[i].trim());
            } catch (NumberFormatException e) {
                System.out.println(ERROR_MESSAGE);
                System.exit(ERROR_EXIT_CODE);
            }
        }
        return result;
    }

    public static void printElementsMultipleOfThree(int[] array) {
        for (int current : array) {
            if (current % 3 == 0) {
                System.out.println(current);
            }
        }
    }
}
