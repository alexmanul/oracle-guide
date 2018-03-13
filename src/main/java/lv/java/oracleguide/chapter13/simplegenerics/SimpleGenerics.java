package lv.java.oracleguide.chapter13.simplegenerics;

public class SimpleGenerics {

    public static void main(String[] args) {

        TwoGenerics<Integer, String> tgObject = new TwoGenerics<>(88, "Обобщения");
        tgObject.showTypes();

        int value = tgObject.getObject1();
        System.out.println("Значение: " + value);

        String string = tgObject.getObject2();
        System.out.println("Значение: " + string);
    }
}