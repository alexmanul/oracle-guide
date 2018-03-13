package lv.java.oracleguide.chapter13.wildcarddemo;

public class WildcardDemo {

    public static void main(String[] args) {

        NumericFns<Integer> iObject = new NumericFns<>(6);
        NumericFns<Double> dObject = new NumericFns<>(-6.0);
        NumericFns<Long> lObject = new NumericFns<>(6L);

        System.out.println("Сравнение iObject и dObject: ");
        if (iObject.absEqual(dObject)) {
            System.out.println("Абсолютные значения совпадают");
        } else {
            System.out.println("Абсолютные значения отличаются ");
        }

        System.out.println("Сравнение iObject и lObject: ");
        if (iObject.absEqual(lObject)) {
            System.out.println("Абсолютные значения совпадают");
        } else {
            System.out.println("Абсолютные значения отличаются ");
        }
    }
}