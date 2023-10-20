package prac8;

import java.util.Scanner;

public class PrintDigitsRecursively {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = scanner.nextInt();

        System.out.print("Цифры числа N: ");
        printDigits(N);
    }

    public static void printDigits(int number) {
        if (number < 10) {
            System.out.print(number + " "); // Вывод последней цифры и пробела
        } else {
            printDigits(number / 10); // Рекурсивный вызов для оставшейся части числа
            System.out.print(number % 10 + " "); // Вывод последней цифры и пробела
        }
    }
}

