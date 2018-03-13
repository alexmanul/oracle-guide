package lv.java.oracleguide.chapter13.genericqueue;

public interface IGenericQueue<T> {
    void put(T object) throws QueueFullException;

    T get() throws QueueEmptyException;
}