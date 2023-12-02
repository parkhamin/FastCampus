package fc.java.part2;

// 관계(비교) 연산자 : 왼쪽과 오른쪽의 대소 관계를 비교하는 연산자
// 연산의 결과는 참(true) 아니면 거짓(false)
public class RelationalOperTest {
    public static void main(String[] args) {
        // Q. 관계(비교) 연산자의 결과 값을 쓰시오
        int a = 4;
        System.out.println(a > 5); // false
        System.out.println(a < 5); // true
        System.out.println(a == 6); // false
        System.out.println(a != 4); // false
        System.out.println(3 >= a); // false
        System.out.println(a <= a+1); // true
    }
}
