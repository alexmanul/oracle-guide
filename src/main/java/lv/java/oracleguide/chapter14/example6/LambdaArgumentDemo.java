package lv.java.oracleguide.chapter14.example6;

class LambdaArgumentDemo {

    private static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения расширяют Java";
        String outStr;

        System.out.println("Входная строка: " + inStr);


        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("\nОбращённая строка: " + outStr);

        // Данное лямбда-выражение заменяет пробелы дефисами.
        // Оно внедряется непосредственно в вызов метода changeStr().
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("\nСтрока с заменёнными пробелами: " + outStr);

        // Данное лямбда-выражение обращает регистр буквв строке.
        // Оно также внедряется непосредственно в вызов метода changeStr().
        outStr = changeStr((str) -> {
                    String result = "";
                    char ch;

                    for (int i = 0; i < str.length(); i++) {
                        ch = str.charAt(i);
                        if (Character.isUpperCase(ch))
                            result += Character.toLowerCase(ch);
                        else result += Character.toUpperCase(ch);
                    }
                    return result;
                }
                , inStr);
        System.out.println("\nСтрока с обращённым регистром букв: " + outStr);

    }
}
