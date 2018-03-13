package lv.java.oracleguide.chapter13.simplegenerics;

class TwoGenerics<T, V> {
    private T object1;
    private V object2;

    // Конструктор. Передать конструктору ссылки на обьекты типов T и V
    TwoGenerics(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }
    // Геттер. Вернуть объект типа T из метода
    T getObject1() {
        return object1;
    }

    // Геттер. Вернуть объект типа V из метода
    V getObject2() {
        return object2;
    }

    // Отобразить типы Т и V
    void showTypes() {
        System.out.println("Тип T - это " + object1.getClass().getName());
        System.out.println("Тип V - это " + object2.getClass().getName());
    }
}