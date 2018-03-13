package lv.java.oracleguide.chapter14.example3;

public class LambdaDemo3 {
    public static void main(String[] args) {

        StringTest isIn = (a, b) -> a.indexOf(b) != -1;
        // можно использовать также a.contains(b);

        String str = "Манул - это мой белый котик!";
        String str1 = "котик";
        String str2 = "змея";

        System.out.println("Тестируемая строка: " + str);

        if (isIn.test(str, str1))
            System.out.println("Слово '" + str1 + "' найдено");
        else System.out.println("Слово '" + str1 + "' не найдено");


        if (isIn.test(str, str2))
            System.out.println("Слово '" + str2 + "' найдено");
        else System.out.println("Слово '" + str2 + "' не найдено");
    }
}