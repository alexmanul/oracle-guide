package lv.java.oracleguide.chapter13.useboundedwildcard;

public class UseBoundedWildcard {

    private static void test(Generic<? extends A> object) {
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Generic<A> w1 = new Generic<>(a);
        Generic<B> w2 = new Generic<>(b);
        Generic<C> w3 = new Generic<>(c);
        Generic<D> w4 = new Generic<>(d);

        test(w1);
        test(w2);
        test(w3);
        // test(w4) - Не допустимо, так как D не относится к подклассам А;
    }
}