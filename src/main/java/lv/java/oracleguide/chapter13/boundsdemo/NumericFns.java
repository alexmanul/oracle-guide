package lv.java.oracleguide.chapter13.boundsdemo;

// В этой верси класса NumericFns аргументом типа, заменяющим параметр Т,
// должен стать класс Number или унаследованный от него подкласс
class NumericFns<T extends Number> {
    private T number;

    // Конструктор. Передать конструктору ссылку на числовой объект
    NumericFns(T number) {
        this.number = number;
    }

    // Вернуть обратную величину
    double reciprocal() {
        return 1 / number.doubleValue();
    }

    // Вернуть дробную часть
    double fraction() {
        return number.doubleValue() - number.doubleValue();
    }
}