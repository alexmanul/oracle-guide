package lv.java.oracleguide.chapter13.genericqueue;

// Обобщённый класс, реализующий очередь фиксированого размера
class GenericQueue<T> implements IGenericQueue<T> {

    // Массив для хранения элементов очереди
    private T queue[];

    // Индексы вставки и извлечения элементов очереди
    private int putloc;
    private int getloc;

    GenericQueue(T[] queue) {
        this.queue = queue;
        this.putloc = this.getloc = 0;
    }

    @Override
    public void put(T object) throws QueueFullException {
        if (putloc == queue.length - 1)
            throw new QueueFullException(queue.length);
        queue[putloc++] = object;
    }

    @Override
    public T get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return queue[getloc++];
    }
}