package prac14;

import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
        String[] emails = {"user@yandex.ru", "root@host", "mylocal@@@com.ru", "@my.ru", "Alex Spring"};

        // Создаем регулярное выражение для проверки email-адресов
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);

        // Проверяем каждый email-адрес
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                System.out.println(email + " - Корректный email-адрес.");
            } else {
                System.out.println(email + " - Некорректный email-адрес.");
            }
        }
    }
}
