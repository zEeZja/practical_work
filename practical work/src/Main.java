import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static int get_factorial(int f){
        int factorial_result = 1;
        for (int i = 1; i <= f; i++) {
            factorial_result *= i;
        }
        return factorial_result;
    }
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
        for (String arg : args) {
            System.out.println(arg);
        }
        for (int j = 1; j < 11; j++) {
            double result = (double) 1 /j;
            System.out.printf("%f, ", +result);
        }
        System.out.println(" ");
        System.out.println("Введите число, факториал которого нужно вычислить: ");
        int count = input.nextInt();
        System.out.println("Факториал числа " +count +" равен: " +get_factorial(count));
    }
}
