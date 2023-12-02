package fc.java.part2;

// 대입연산자(=) : 연산자 오른쪽 수식의 값을 왼쪽 변수에 대입
public class AssignOperTest {
    public static void main(String[] args) {
        /*
        복합 대입 연산자
        a += b -> a = a + b
        a -= b -> a = a - b
        a *= b -> a = a * b
        a /= b -> a = a / b
        a %= b -> a = a % b
        */

        // Q. 아래를 수행 후 결과 값은 얼마인가?
        int a = 1;
        a++;
        ++a;
        a = a + 1;
        a += 1;
        System.out.println("a = " + a);

        int b = 7;
        b--;
        --b;
        b = b - 1;
        b -= 1;
        System.out.println("b = " + b);

    }
}
