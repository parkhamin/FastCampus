package fc.java.part2;

/*
    논리 연산자 : 연산의 결과는 참(true) 아니면 거짓(false)
    !a : a가 참이면 거짓, 거짓이면 참
    a && b : a, b가 둘 다 참이면 참이고, 그렇지 않으면 거짓
    a || b : a, b 중 하나라도 참이면 참이고, 그렇지 않으면 거짓
 */
public class LogicalOperTest {
    public static void main(String[] args) {
        // Q. 논리 연산자의 결과값을 쓰시오
        int x = 1, y = 0;
        System.out.println(!(x>0)); // false
        System.out.println(x>0 && x<3); // true
        System.out.println(x>0 && y<0); // true
        System.out.println(x<0 || y>=0); // true
        System.out.println(y<0 || y<-5); // false

        int a = 3, b = 5;
        System.out.println((a>=3) && (b<6)); // true
        System.out.println((a!=3) && (a>2)); // false
        System.out.println((b!=5) || (a==1)); // false
    }
}
