package lv.java.oracleguide.chapter09.exctest;

class UseThrowableMethods {

    public static void main(String[] args) {

        try {

            ExcTest.genException();

        } catch (ArrayIndexOutOfBoundsException e) {
            // перехватить исключение
            System.out.println("Стандартное сообщение: ");
            System.out.println(e);
            System.out.println("\nСтек вызовов: ");
            e.printStackTrace();
        }
        System.out.println("После оператора catch");
    }
}