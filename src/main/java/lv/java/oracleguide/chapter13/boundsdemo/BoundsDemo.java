package lv.java.oracleguide.chapter13.boundsdemo;

public class BoundsDemo {

    public static void main(String[] args) {

        NumericFns<Integer> iObject = new NumericFns<>(5);
        System.out.println("Обратная величина iObject - " + iObject.reciprocal());
        System.out.println("Дробная часть iObject - " + iObject.fraction());
        System.out.println();

        NumericFns<Double> dObject = new NumericFns<>(2.5);
        System.out.println("Обратная величина dObject - " + dObject.reciprocal());
        System.out.println("Дробная часть dObject - " + dObject.fraction());
        System.out.println();

        NumericFns<Float> fObject = new NumericFns<>(1.25f);
        System.out.println("Обратная величина fObject - " + fObject.reciprocal());
        System.out.println("Дробная часть fObject - " + fObject.fraction());
        System.out.println();

    }
}