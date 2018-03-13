package lv.java.oracleguide.chapter13.genericdemo;

class Generic<T> {
    // Объявить объект типа T
    private T object;

    // Конструктор. Передать конструктору ссылку на обьект типа Т
    Generic(T object) {
        this.object = object;
    }

    // Геттер. Вернуть объект из метода
    T getObject() {
        return object;
    }

    // Отобразить тип Т
    void showType() {
        System.out.println("Тип T - это " + object.getClass().getName());
    }
}