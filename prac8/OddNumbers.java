package prac8;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        processInput();
    }

    public static void processInput() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 0) {
            return; // Базовый случай: если введено 0, завершаем выполнение
        }

        if (num % 2 != 0) {
            System.out.println(num); // Выводим нечетное число
        }

        processInput(); // Рекурсивный вызов для следующего числа
    }
}

