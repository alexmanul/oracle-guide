package lv.java.oracleguide.chapter13.genericqueue;

public class GenericQueueDemo {

    public static void main(String[] args) {
        Integer iStore[] = new Integer[10];
        GenericQueue<Integer> queue = new GenericQueue<>(iStore);

        Integer iValue;

        System.out.println("Демонстрация очереди чисел типа Integer");
    }
}