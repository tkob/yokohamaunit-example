package yokohama.unit.example;

public class Calc {
    public int div(int dividend, int divisor) {
        if (divisor == 0) throw new IllegalArgumentException("div by zero");
        return dividend / divisor;
    }
}
