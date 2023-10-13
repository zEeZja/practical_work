package prac6;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Сатурн");
        Nameable car = new Car("Skoda Octavia");
        Nameable animal = new Animal("Кабанчик");

        System.out.println("Имя планеты: " + planet.getName());
        System.out.println("Имя машины: " + car.getName());
        System.out.println("Имя животного: " + animal.getName());

        Priceable car2 = new Car2(1750000.0);
        Priceable apartment = new Apartment(13.0);
        Priceable pc = new PC(123000.0);

        System.out.println("Цена машины: " + car2.getPrice() + " ₽");
        System.out.println("Цена квартиры: " + apartment.getPrice() + " млн. ₽");
        System.out.println("Цена компьютера: " + pc.getPrice() + " ₽");
    }
}