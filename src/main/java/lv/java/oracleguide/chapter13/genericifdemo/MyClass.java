package lv.java.oracleguide.chapter13.genericifdemo;

// Реализация интерфейса с помощью массива, предназначенного для хранения значений.
// Любой класс, реализующий обобщённый интерфейс, также должен быть обобщённым.
class MyClass<T> implements Containment<T> {
    private T[] arrayRef;

    MyClass(T[] arrayRef) {
        this.arrayRef = arrayRef;
    }

    @Override
    public boolean contains(T o) {
        for (T x : arrayRef)
            if (x.equals(o)) return true;
        return false;
    }
}