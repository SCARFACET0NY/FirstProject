package calculator;

public class Main {
    public static void main(String[] args) {
        String expression = "(1 + 2) * 4 + 5 * (3 + 6)";
        System.out.println(Calculator.calculateExpression(expression));
    }
}
