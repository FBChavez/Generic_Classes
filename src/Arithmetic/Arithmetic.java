package Arithmetic;

public class Arithmetic<T extends Number, U extends Number> {
    private T num1;
    private U num2;

    public Arithmetic(T num1, U num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("We cannot divide a number by zero!");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public double getMin() {
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public double getMax() {
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}
