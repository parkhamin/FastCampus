package fc.java.part3;

import fc.java.model.MyUtil1;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtil1 -> none static이므로 new를 이용해서 객체 생성 해야 함.
        MyUtil1 mu = new MyUtil1();
        int sum = mu.hap(a, b);
        System.out.println("sum = " + sum);
    }
}
