public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);

        // ошибка возникает из-за того, что в коде (оперция деления) не предусмотренно, как поступить, если у=0
    }
}