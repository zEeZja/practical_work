package prac8;

import java.util.Scanner;

public class ReversePrintDigitsRecursively {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = scanner.nextInt();

        System.out.print("Цифры числа N в обратном порядке: ");
        reversePrintDigits(N);
    }

    public static void reversePrintDigits(int number) {
        if (number < 10) {
            System.out.print(number + " "); // Вывод последней цифры и пробела
        } else {
            System.out.print(number % 10 + " "); // Вывод последней цифры и пробела
            reversePrintDigits(number / 10); // Рекурсивный вызов для оставшейся части числа
        }
    }
}

