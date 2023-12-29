package prac24;

import java.util.Scanner;

// A
class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}

// B
interface ComplexAbstractFactory {
    Complex createComplex();
    Complex createComplex(int real, int image);
}

// Complex
record Complex(int real, int image) {

    public void print() {
        System.out.println(real() + " + " + image() + "i");
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex = factory.createComplex();
        complex.print();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real and image part: ");
        int real = scanner.nextInt();
        int image = scanner.nextInt();
        complex = factory.createComplex(real, image);
        complex.print();
    }
}
