package lv.java.oracleguide.chapter10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// Пример простой утилиты для ввода данных с клавиатуры и записи их на диск,
// демонстрирующий использование класса FileWriter.

class KtoD {

    public static void main(String[] args) {

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка stop");

        // Создание обьекта FileWriter
        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;

                str = str + "\r\n"; // Добавить символы перевода строки
                fw.write(str); // Запись текстовых строк в файл
            } while (str.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
         
        }
    }
}