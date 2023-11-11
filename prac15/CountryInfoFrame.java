package prac15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryInfoFrame extends JFrame {
    private final JComboBox<String> countryComboBox;
    private final JTextArea infoTextArea;

    public CountryInfoFrame() {
        // Создаем выпадающий список с названиями стран
        String[] countries = {"Australia", "China", "England", "Russia"};
        countryComboBox = new JComboBox<>(countries);

        // Создаем область текста для отображения информации
        infoTextArea = new JTextArea(10, 25);
        infoTextArea.setEditable(false);

        // Добавляем слушателя событий для JComboBox
        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                assert selectedCountry != null;
                displayCountryInfo(selectedCountry);
            }
        });

        // Добавляем компоненты на панель
        this.setLayout(new FlowLayout());
        this.add(countryComboBox);
        this.add(new JScrollPane(infoTextArea));

        // Настройки размера и поведения окна
        this.setTitle("Информация о стране");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    // Метод для отображения информации о стране
    private void displayCountryInfo(String country) {
        // Здесь можно добавить реальную информацию о стране
        switch (country) {
            case "Australia" -> infoTextArea.setText("""
                    Самая маленькая часть света, состоит из
                    материка Австралия и крупной системы\s
                    островов между Малайзией и Австралией
                    под названием Океания (делится на\s
                    Микронезию, Полинезию и Меланезию). На востоке\s
                    омывается водами Тихого океана, на\s
                    севере, западе и юге – Индийского. Площадь этой\s
                    части света – 8,9 миллионов км2, население\s
                    составляет 32,6 миллиона человек (около 0,3 %
                    всего населения Земли), большая часть проживает
                    в Австралии.""");
            case "China" -> infoTextArea.setText("""
                    Это государство Восточной Азии с богатой историей
                    в прошлом и одна из крупнейших держав в настоящем.\s
                    По свидетельству историков, Китай - одно из старейших\s
                    государств мира, возраст китайской цивилизации может составлять\s
                    около пяти тысяч лет. Человечество обязано ему многими изобретениями,
                    культурными ценностями и самой древнейшей философией,
                    актуальной по сей день. В современном мире Китай\s
                    (Китайская Народная Республика) занимает видное политическое
                    и экономическое положение. Сейчас КНР уже претендует на\s
                    положение самой крупной мировой экономики.""");
            case "England" -> infoTextArea.setText("""
                    Англия не является независимым государством.
                    Это крупная административно-политическая часть Соединенного\s
                    Королевства Великобритании и Северной Ирландии. Самые большие
                    города Англии: Шеффилд, Бирмингем, Манчестер и Ливерпуль.
                    Такжев состав ее территории входит столица Великобритании, Лондон.""");
            case "Russia" -> infoTextArea.setText("""
                    Россия - самая большая страна мира (площадь - 17,12
                    миллионов км2, 12% или 1/8 часть всей поверхности суши нашей планеты).
                    Государство располагается в Северном и Восточном полушариях,
                    восточная часть в Западном, на севере материка Евразия, в его европейской
                    и азиатской частях.
                    Самую протяженную береговую линию (37,6 тыс. км2) омывают воды 12
                    морей, принадлежащих к бассейнам Тихого, Северного Ледовитого, а также Атлантического океанов.
                    Россия имеет границы с 16 странами (наивысший показатель в мире) по суше,
                    и с двумя по морю (Япония, США).""");
            default -> infoTextArea.setText("Выберете страну.");
        }
    }

    public static void main(String[] args) {
        // Запускаем программу
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CountryInfoFrame();
            }
        });
    }
}
