package lv.java.oracleguide.chapter14.example4;

public class BlockLambdaDemo {
    public static void main(String[] args) {

        // Блочное лямбда-выражение.
        // Возвращает наименьший положительный делитель заданного целого числа
        NumericFunc smallestF = (n) -> {
            int result = 1;

            // Get absolute value of n
            n = n < 0 ? -n : n;
            for (int i = 2; i <= n / i; i++)
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            return result;

        };
        System.out.println("Наименьшим делителем 12 является " + smallestF.func(12));
        System.out.println("Наименьшим делителем 11 является " + smallestF.func(11));
    }
}