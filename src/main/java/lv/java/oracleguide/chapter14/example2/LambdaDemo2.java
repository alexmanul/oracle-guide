package lv.java.oracleguide.chapter14.example2;

// Интерфейс NumericTest используется с тремя различными лямбда-выражениями
public class LambdaDemo2 {

    public static void main(String[] args) {
        // Данное лямбда-выражение проверяет, кратно ли одно число другому
        NumericTest isFactor = (n, m) -> (n % m) == 0;

        if (isFactor.test(10, 2))
            System.out.println("Число 2 является делителем для числа 10");
        if (!isFactor.test(10, 3))
            System.out.println("Число 3 не является делителем для числа 10");
        System.out.println();

        // Данное лямбда-выражение возвращает true, если первый аргумент меньше второго аргумента
        NumericTest lessThan = (n, m) -> (n < m);

        if (lessThan.test(2, 10))
            System.out.println("Число 2 меньше числа 10");
        if (!lessThan.test(10, 2))
            System.out.println("Число 10 не меньше числа 2");
        System.out.println();

        // Данное лямбда-выражение возвращает true, если оба аргумента равны по абсолютной величине
        NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

        if (absEqual.test(4, -4))
            System.out.println("Абсолютные величины 5 и -5 равны");
        if (!lessThan.test(4, -5))
            System.out.println("Абсолютные величины 4 и -5 не равны");
        System.out.println();
    }

}