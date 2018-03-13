package lv.java.oracleguide.chapter09.exctest;

// В операторах catch исключения подкласса должны предшествовать исключениям суперкласса
class ExcDemo5 {

    public static void main(String[] args) {
        // Длина массива numer превышает длину массива denom
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " равно " + numer[i] / denom[i]);

            } catch (ArrayIndexOutOfBoundsException e) {
                // Перехват исключения подкласса
                System.out.println("Соответствующий элемент не найден!");

            } catch (Throwable e) {
                // Перехват исключения суперкласса
                System.out.println("Возникло исключение!");
            }
        }
    }
}