package prac7;

class MathFunc implements MathCalculable {
    @Override
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double modulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Другие методы или вычисления могут быть добавлены в этот класс

    public double circumference(double radius) {
        return 2 * PI * radius; // Пример использования константы PI
    }
}
