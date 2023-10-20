package prac8;

import java.util.Scanner;

public class DigitSum {
    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n; // Базовый случай: если число однозначное, то сумма цифр равна самой цифре
        } else {
            return n % 10 + sumOfDigits(n / 10); // Рекурсивно вызываем функцию для оставшейся части числа
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, сумму цифр которого вы хотите посчитать: ");
        int N = in.nextInt();
        int result = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + result);
    }
}