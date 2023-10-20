package prac7;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc(); // Верно
        // MathCalculable mc2 = new MathCalculable(); // Ошибка - нельзя создать экземпляр интерфейса

        MathFunc mathFunc = new MathFunc();
        double result1 = mathFunc.power(2, 3); // 2^3 = 8
        double result2 = mathFunc.modulus(3, 4); // Модуль комплексного числа 3 + 4i
        double result3 = mathFunc.circumference(5); // Длина окружности с радиусом 5

        System.out.println("2^3 = " + result1);
        System.out.println("|3 + 4i| = " + result2);
        System.out.println("Длина окружности с радиусом 5 = " + result3);
    }
}
