package lv.java.oracleguide.chapter09.rethrow;

class RethrowDemo {

    public static void main(String[] args) {

        try {
            Rethrow.genException();

        } catch (ArrayIndexOutOfBoundsException e) {
            // Повторно перехватить исключение
            System.out.println("Фатальная ошибка - выполнение программы прервано!");
        }
    }
}