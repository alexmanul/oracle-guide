package lv.java.oracleguide.chapter13.genericifdemo;

public class GenericIfDemo {

    public static void main(String[] args) {

        Integer x[] = {1, 2, 3};

        MyClass<Integer> object = new MyClass<Integer>(x);

        if (object.contains(2)) {
            System.out.println("2 содержится в object");
        } else {
            System.out.println("2 не содержится в object");
        }


        if (object.contains(5)) {
            System.out.println("5 содержится в object");
        } else {
            System.out.println("5 не содержится в object");
        }
    }
}