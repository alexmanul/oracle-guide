package lv.java.oracleguide.chapter09.exctest;

class ThrowDemo {

    public static void main(String[] args) {

        try {
            System.out.println("До оператора throw");
            // Сгенерировать исключение
            throw new ArithmeticException();

        } catch (ArithmeticException e) {
            // Перехватить исключение
            System.out.println("Исключение перехвачено");
        }
        System.out.println("После блока try/catch");
    }
}