package lv.java.oracleguide.chapter14.example6;

// Интерфейс определяет метод func(), который принмиает аргумент типа String и возвращает результат
// типа String. Таким образом, метод может воздействовать неа строку и возвращать результат.

interface StringFunc {
    String func(String str);
}
