package lv.java.oracleguide.chapter09.stack;

public class StackEmptyException extends Exception{

    public String toString (){
        return "\nСтек пуст. ";
    }
}