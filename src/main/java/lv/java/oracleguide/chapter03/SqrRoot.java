package lv.java.oracleguide.chapter03;

public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("корень квадратный из " + num + " равен " + sroot);

            //вычислим ошибку округления:
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}