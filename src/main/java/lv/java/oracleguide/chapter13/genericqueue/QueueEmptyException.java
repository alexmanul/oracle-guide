package lv.java.oracleguide.chapter13.genericqueue;

public class QueueEmptyException extends Exception {
    private int size;

    @Override
    public String toString() {
        return "\nОчередь пуста";
    }
}