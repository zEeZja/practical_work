import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array1));
        double average;
        double sum = 0;
        for (int i : array1) {
            sum += i;
        }
        average = sum / array1.length;
        System.out.println("Арифметическая сумма массива равна: " + average);
        System.out.println("Сумма массива равна: " + sum);
//
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите количество элементов вашего массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] array2 = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы вашего массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array2[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("Ваш введенный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array2[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
        int sum2 = 0;
        int i = 0;
        do {
            sum2 += Integer.parseInt(String.valueOf(array2[i]));
            i++;
        } while (array2.length != i);

        System.out.println("Сумма элементов массива: " + sum2);
        int min = Arrays.stream(array2).min().getAsInt();
        int max = Arrays.stream(array2).max().getAsInt();
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
        //
        for (int a = 0; a < args.length; a++) {
            System.out.println(args[a]);
        }
    }
}
