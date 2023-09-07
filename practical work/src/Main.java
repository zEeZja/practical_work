import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(Array));
        double average;
        double sum = 0;
        for (int i : Array) {
            sum += i;
        }
        average = sum / Array.length;
        System.out.println("Арифметическая сумма массива равна: " + average);
        System.out.println("Сумма массива равна: " + sum);
    }
}