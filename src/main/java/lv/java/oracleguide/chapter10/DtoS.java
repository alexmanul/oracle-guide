package lv.java.oracleguide.chapter10;

// Пример простой утилиты для чтения данных с диска и вывода их на экран,
// демонстрирующий использование класса FileReader.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class DtoS {

    public static void main(String[] args) {

        String str;
        // Создать и использовать объект FileReader, помещённый в оболочку на основе класса BufferedReader

        // Создание объекта FileReader
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            // Чтение строк из файла и отображение их на экране
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {

            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}