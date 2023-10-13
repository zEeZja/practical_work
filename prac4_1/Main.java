package prac4_1;
public class Main {
    public static void main(String[] args) {
        // Пример использования классов и подсчета времени и стоимости перевозки
        Car car = new Car("Легковой автомобиль", 8.5); // Расход топлива 8.5 л/100 км
        int passengers = 4;
        double cargoWeight = 500; // 500 кг груза
        double distance = 300; // 300 км расстояния

        Transport transport = new Car("Test", 1.0);

        double passengerCost = car.calculatePassengerTransportCost(passengers);
        double cargoCost = car.calculateCargoTransportCost(cargoWeight);
        double travelTime = car.calculateTravelTime(distance);

        System.out.println("Транспорт: " + car.getName());
        System.out.println("Стоимость перевозки пассажиров: " + passengerCost + " ₽");
        System.out.println("Стоимость перевозки груза: " + cargoCost + " ₽");
        System.out.println("Время в пути: " + travelTime + " часов"+"\n\n\n");




        // Создаем массив объектов суперкласса Student и заполняем его
        Student[] students = new Student[5];
        students[0] = new SchoolStudent("Иван", 15, 9);
        students[1] = new SchoolStudent("Маша", 14, 8);
        students[2] = new UniversityStudent("Петр", 20, "РТУ МИРЭА");
        students[3] = new UniversityStudent("Аня", 19, "РАНХИГС");
        students[4] = new SchoolStudent("Сергей", 16, 10);

        // Показываем студентов и школьников
        System.out.println("Students:");
        for (Student student : students) {
            if (student instanceof UniversityStudent) {
                UniversityStudent universityStudent = (UniversityStudent) student;
                System.out.println("Имя: " + universityStudent.getName() + ", Возраст: " + universityStudent.getAge() + ", Университет: " + universityStudent.getUniversity());
            }
        }

        System.out.println("\nSchool Students:");
        for (Student student : students) {
            if (student instanceof SchoolStudent) {
                SchoolStudent schoolStudent = (SchoolStudent) student;
                System.out.println("Имя: " + schoolStudent.getName() + ", Возраст: " + schoolStudent.getAge() + ", Класс: " + schoolStudent.getGrade());
            }
        }
    }
}
