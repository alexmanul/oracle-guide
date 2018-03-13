package lv.java.oracleguide.chapter14.example5;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {

        // Данное лямбда-выражение проверяет, кратно ли одно число другому
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("Число 2 является делителем для числа 10");
        System.out.println();

        // Данное лямбда-выражение проверяет, кратно ли одно число другому
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

        if (isFactorD.test(212.0, 4.0))
            System.out.println("Число 4.0 является делителем для числа 212.0");
        System.out.println();
    }
}