package lv.java.oracleguide.chapter09.exctest;

// Демонстрация обработки исключений
class ExcDemo1 {

    public static void main(String[] args) {

        int nums[] = new int[4];

        // Создаётся блок try - блок кода, в котором должны отслеживаться ошибки
        try {
            System.out.println("До генерации исключения");

            // Попытка использовать индекс, выходящий за границы массива
            nums[5] = 10;
            System.out.println("Эта строка не будет отображаться");
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Выход за границы массива");
        }
        System.out.println("После оператора catch");
    }
}