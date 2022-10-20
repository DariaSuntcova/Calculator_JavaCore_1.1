public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);  // 3
        int b = calc.minus.apply(1,1); // 0
        int c = calc.devide.apply(a, b); // В данном случае возникает ошибка ArithmeticException из-за деления на 0

        // Для решения можно использовать блок try catch или изменить передаваемые параметры

        calc.println.accept(c);
    }
}