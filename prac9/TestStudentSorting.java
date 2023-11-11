package prac9;

public class TestStudentSorting {
    public static void main(String[] args) {
        Student[] students = {
                new Student(123, "Alice"),
                new Student(456, "Bob"),
                new Student(789, "Charlie"),
                new Student(234, "David"),
                new Student(567, "Eve")
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортировка массива с использованием сортировки вставками
        insertionSort(students);

        System.out.println("\nAfter sorting by IDNumber:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}