package lv.java.oracleguide.chapter13.genericifdemo;

// Пример обобщённого интерфейса.
// Класс, реализующий этот интерфейс, содержит одно или несколько значений.
interface Containment<T> {

    // Метод contains() проверяет, содержится ли некоторый элемент в объекте класса,
    // реализущего интерфейс Containment
    boolean contains(T o);
}