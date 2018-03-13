package lv.java.oracleguide.chapter13.genericdemo;

public class GenericDemo {

    public static void main(String[] args) {

        // Создать объект типа Gen<Integer> и присвоить ссылку на него переменной iObject.
        Generic<Integer> iObject = new Generic<>(88);
        // Отобразить тип данныхб используемых в объекте iObject
        iObject.showType();

        int value = iObject.getObject();
        System.out.println("Значение: " + value);

        Generic<String> sObject = new Generic<>("Тестирование обобщений");
        sObject.showType();

        String stringValue = sObject.getObject();
        System.out.println("Значение: " + stringValue);
    }
}