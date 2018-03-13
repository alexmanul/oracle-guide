package lv.java.oracleguide.chapter14.example1;

public class LambdaDemo {

    public static void main(String[] args) {

        MyValue myValue; // объявление ссылки на интерфейс

        // Здесь лямбда-выражение - это просто константа. При его назначении переменной myValue
        // создаётся экземпляр класса, в котором лямбда-выражение реализует метод getValue()
        // интерфейса MyValue

        myValue = () -> 98.6; // простое лямбда-выражение

        // Вызвать метод getValue(), предоставляемый ранее назначенным лямбда-выражением
        System.out.println("Постоянное значение: " + myValue.getValue());

        // Создать параметризованное лямбда-выражение и назначить его ссылке на экземпляр MyParamValue.
        // Это лямбда-выражение возаращает обратную величину своего аргумента
        MyParamValue myParamValue = (n) -> 1.0 / n; //Лямбда-выражение, имеющее параметр

        // Вызвать метод getValue(v) посредством ссылки myParamValue
        System.out.println("Обратная величина 4 равна " + myParamValue.getValue(4.0));
        System.out.println("Обратная величина 8 равна " + myParamValue.getValue(8.0));
    }
}