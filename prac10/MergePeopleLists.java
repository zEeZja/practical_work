package prac10;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Класс People представляет человека с именем и возрастом.
record People(String name, int age) {
}

public class MergePeopleLists {
    public static void main(String[] args) {
        // Создаем два списка данных о людях.
        List<People> list1 = new ArrayList<>();
        list1.add(new People("Алиса", 25));
        list1.add(new People("Григорий", 19));

        List<People> list2 = new ArrayList<>();
        list2.add(new People("Петр", 27));
        list2.add(new People("Дмитрий", 15));

        // Объединяем два списка в один.
        List<People> mergedList = new ArrayList<>(list1); // Копируем list1 в mergedList
        mergedList.addAll(list2); // Добавляем все элементы из list2 в mergedList

        // Сортируем объединенный список людей по возрасту.
        mergedList.sort(new Comparator<People>() {
            @Override
            public int compare(People person1, People person2) {
                // Сортировка по возрасту в порядке возрастания.
                return Integer.compare(person1.age(), person2.age());
            }
        });

        // Выводим отсортированный список людей на консоль.
        System.out.println("Отсортированный список людей по возрасту:");
        for (People person : mergedList) {
            System.out.println("Имя: " + person.name() + ", Возраст: " + person.age());
        }
    }
}
