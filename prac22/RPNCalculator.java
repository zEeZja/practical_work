package prac22;

import java.util.Scanner;
import java.util.Stack;

public class RPNCalculator {
    private final Stack<Double> stack;

    public RPNCalculator() {
        stack = new Stack<>();
    }

    public double calculate(String[] tokens) {
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid expression: not enough operands for operator " + token);
                }

                double operand2 = stack.pop();
                double operand1 = stack.pop();

                switch (token) {
                    case "+" -> stack.push(operand1 + operand2);
                    case "-" -> stack.push(operand1 - operand2);
                    case "*" -> stack.push(operand1 * operand2);
                    case "/" -> {
                        if (operand2 == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        stack.push(operand1 / operand2);
                    }
                    default -> throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression: too many operands");
        }

        return stack.pop();
    }

    private boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RPNCalculator calculator = new RPNCalculator();

        System.out.println("Enter the RPN expression (space-separated tokens):");
        String input = scanner.nextLine();
        String[] expression = input.split("\\s+");

        try {
            double result = calculator.calculate(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
