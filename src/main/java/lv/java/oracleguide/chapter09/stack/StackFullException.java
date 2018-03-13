package lv.java.oracleguide.chapter09.stack;

public class StackFullException extends Exception {

    private int size;
    StackFullException(int s) {
        size = s;
    }

    public String toString (){
        return "\nСтек заполнен. Максимальный размер стека: " + size;
    }

}