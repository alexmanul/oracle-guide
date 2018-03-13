package lv.java.oracleguide.chapter09.usefinally;

class UseFinally {

    static void genException(int what) {

        int t;
        int nums[] = new int[2];

        System.out.println("Получено: " + what);

        try {
            switch (what) {
                case 0:
                    t = 10 / what; //сгенерировать ошибку деления на нуль
                    break;
                case 1:
                    nums[4] = 4; //сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException e) {
            // Перехватить исключение
            System.out.println("Попытка деления на нуль");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Перехватить исключение
            System.out.println("Соответствующий элемент не найден");
        } finally {
            //этот блок выполняется независимо от того, каким образом завершается блок try/catch
            System.out.println("Выход из блока try");
        }
    }
}