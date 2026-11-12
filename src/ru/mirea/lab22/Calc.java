package ru.mirea.lab22;
import java.util.EmptyStackException;
import java.util.Stack;
public class Calc {
    public double RPN(String expression) throws EmptyStackException, ArithmeticException, IllegalArgumentException {
        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Выражение пустое");
        }
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.trim().split("\\s+");
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new EmptyStackException("Недостаточно элементов");
                }
                double b = stack.pop();
                double a = stack.pop();
                double res = performOperation(a, b, token);
                stack.push(res);
            } else {
                throw new IllegalArgumentException("Некорректный ввод");
            }
        }
        if (stack.size()!= 1){
            throw new IllegalArgumentException();
        }
        return stack.pop();
    }
    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private double performOperation(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деленить на ноль нельзя!");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }
    }
    public static class EmptyStackException extends Exception {
        public EmptyStackException(String message) {
            super(message);
        }

    }
}


