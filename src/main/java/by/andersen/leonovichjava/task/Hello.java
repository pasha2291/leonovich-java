package by.andersen.leonovichjava.task;

import java.util.Scanner;

//Составить алгоритм: если введенное число больше 7, то вывести “Привет”
public class Hello {
    private static final String INITIAL_MESSAGE = "Введите одно целое число >>>";
    private static final String HELLO = "Привет";

    public static void main(String[] args) {
        System.out.println(INITIAL_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input > 7) {
            System.out.println(HELLO);
        }
    }
}
