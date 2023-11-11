package prac10;

public class Student {
    private String firstName;   // Имя студента
    private String lastName;    // Фамилия студента
    private String major;       // Специальность студента
    private int course;         // Курс, на котором учится студент
    private String group;       // Группа, к которой принадлежит студент

    // Конструктор для создания экземпляра студента с заданными параметрами.
    public Student(String firstName, String lastName, String major, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
    }

    // Геттеры для получения значений свойств.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    // Сеттеры для установки значений свойств.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static void main(String[] args) {
        // Создаем экземпляр студента с помощью конструктора.
        Student student = new Student("Григорий", "Рассказов", "Информатика и вычислительная техника", 2, "ИВБО-01-22");

        // Используем геттеры для получения информации о студенте.
        System.out.println("Информация о студенте:");
        System.out.println("Имя: " + student.getFirstName());
        System.out.println("Фамилия: " + student.getLastName());
        System.out.println("Специальность: " + student.getMajor());
        System.out.println("Курс: " + student.getCourse());
        System.out.println("Гпуппа: " + student.getGroup());

        // Используем сеттеры для изменения информации о студенте.
        student.setCourse(2);
        student.setGroup("ИВБО-01-22");

        // Выводим обновленную информацию о студенте.
        System.out.println("\nОбновленная информация о студенте:");
        System.out.println("Курс: " + student.getCourse());
        System.out.println("Группа: " + student.getGroup());
    }
}
