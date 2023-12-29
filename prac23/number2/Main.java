package prac23.number2;

// Вычисление выражений

// Общий интерфейс для создаваемых классов
interface Expression {
    int evaluate(int x);
}

// Абстрактный базовый класс для бинарных операций
abstract class BinaryOperation implements Expression {
    protected Expression left;
    protected Expression right;

    public BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}

// Класс Const
class Const implements Expression {
    private final int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(int x) {
        return value;
    }
}

// Класс Variable
class Variable implements Expression {

    public Variable(String name) {
    }

    @Override
    public int evaluate(int x) {
        return x;
    }
}

// Класс Add
class Add extends BinaryOperation {
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) + right.evaluate(x);
    }
}

// Класс Subtract
class Subtract extends BinaryOperation {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}

// Класс Multiply
class Multiply extends BinaryOperation {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}

// Класс Divide
class Divide extends BinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate(int x) {
        int divisor = right.evaluate(x);
        if (divisor == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return left.evaluate(x) / divisor;
    }
}

// Класс Main для тестирования
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <value_for_x>");
            return;
        }

        int x = Integer.parseInt(args[0]);

        // Выражение x^2 - 2x + 1
        Expression expression = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );

        // Вычисляем значение выражения
        int result = expression.evaluate(x);

        // Выводим результат
        System.out.println("Значение выражения x^2 - 2x + 1 при x = " + Integer.parseInt(args[0]) + ": " + result);
    }
}
