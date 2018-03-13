package lv.java.oracleguide.chapter06.quicksort;

public class QSDemo {

    public static void main(String[] args) {

        char a [] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.println("Исходный массив");
        for (i=0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        // Отсортировать массив
        QuickSort.qsort(a);

        System.out.println("\nОтсортированный массив");
        for (i=0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

    }

}