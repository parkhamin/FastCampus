package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        NoneStaticTest st = new NoneStaticTest();
        int sum = st.hap(a,b);
        System.out.println("sum = " + sum);
    }

    public int hap(int a, int b){
        int hap = a + b;
        return hap;
    }
}