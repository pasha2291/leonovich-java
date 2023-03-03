package by.andersen.leonovichjava.task;

import java.util.Scanner;

//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет,
// то вывести "Нет такого имени"
public class Vyacheslav {
    private static final String INITIAL_MESSAGE = "Введите ваше имя >>>";
    private static final String NEGATIVE_MESSAGE = "Нет такого имени";
    private static final String NAME_SAMPLE = "Вячеслав";
    private static final String HELLO = "Привет, %s";

    public static void main(String[] args) {
        System.out.println(INITIAL_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.trim().equals(NAME_SAMPLE)) {
            System.out.println(String.format(HELLO, NAME_SAMPLE));
        } else {
            System.out.println(NEGATIVE_MESSAGE);
        }
    }
}
