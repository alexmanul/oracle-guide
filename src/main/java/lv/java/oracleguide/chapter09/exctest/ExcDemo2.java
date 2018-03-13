package lv.java.oracleguide.chapter09.exctest;

class ExcDemo2 {

    public static void main(String[] args) {

        try {
            ExcTest.genException();

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Выход за границы массива");
        }
        System.out.println("После оператора catch");
    }
}