package calculator;

public class Subtract extends BinaryExpression {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate() - right.calculate();
    }
}
