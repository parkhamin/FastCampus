// 산술 연산자 : 사칙 연산자(+, -, *, /)와 나머지 연산자(%)가 있음
public class ArithmeticOperTest {
    public static void main(String[] args) {
        // Q. 나누기와 나머지 연산자의 활용 (정수의 자릿수 구하기)
        int digit = 3625;

        // 일의 자릿수 구하기
        int one = digit % 10;
        System.out.println("one = " + one);

        // 십의 자릿수 구하기
        int ten = digit / 10 % 10;
        System.out.println("ten = " + ten);

        // 백의 자릿수 구하기
        int hun = digit / 100 % 10;
        System.out.println("hun = " + hun);

        //천의 자릿수 구하기
        int thou = digit / 1000 % 10;
        System.out.println("thou = " + thou);

        int num = 6;
        if(num % 2 == 0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }
    }
}
