package lv.java.oracleguide.chapter13.genericqueue;

class QueueFullException extends Exception {
    private int size;

    QueueFullException(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}