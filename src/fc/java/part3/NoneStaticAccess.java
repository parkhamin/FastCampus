package fc.java.part3;

import fc.java.model.MyUtil1;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtil1
        MyUtil1 mu = new MyUtil1();
        int sum = mu.hap(a, b);
        System.out.println("sum = " + sum);
    }
}
