package lv.java.oracleguide.chapter14.example5;

// Обобщённый функциональный интерфейс с двумя параметрами, который возвращает результат типа boolean
interface SomeTest<T> {
    boolean test(T n, T m);
}