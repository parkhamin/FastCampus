package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = hap(a, b);
        System.out.println("sum = " + sum);
    }

    // Q. 매개변수로 2개의 정수를 입력받아서 총합을 구하여 리턴하는 메서드를 정의하시오.
    public static int hap(int a, int b){
        // hap 메서드에 static이 적혀있지 않으면 main과 달리 static zone에 올라가지 않아서 hap 메서드를 호출할 수 없다.
        // static을 적지 않고 메서드를 호출하려면 객체 생성을 해야 한다.
        int hap = a + b;
        return hap;
    }
}
