package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
        // AllStatic st = new AllStatic();
        // System.out.println(st.hap(10, 20));
        // System.out.println(st.max(10, 20));
        // System.out.println(st.min(10, 20));
        // -> private 생성자를 만들면 이 방식으로 사용하지 못하게 할 수 있음.

        System.out.println(AllStatic.hap(10, 20));
        System.out.println(AllStatic.max(10, 20));
        System.out.println(AllStatic.min(10, 20));

        // Math m = mew Math(); // private 생성자
        System.out.println(Math.max(30, 60));
        System.out.println(Math.min(40, 10));
    }
}
