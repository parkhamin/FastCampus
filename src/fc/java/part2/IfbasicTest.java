package fc.java.part2;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        // Q. x의 값이 0보다 큰 경우에만 "양수입니다" 출력하시오
        int x = -10;
        if(x > 0){
            System.out.println("양수입니다.");
        }

        // Q. 정수 1개를 입력 받아 입력된 수가 7의 배수인지를 출력하시오
        Scanner scan = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int num = scan.nextInt();
        if((num & 7) == 0){
            System.out.println("7의 배수입니다.");
        }
        System.out.println("종료");

        // Q. 입력 받은 수가 12의 배수인지를 출력하는 코드를 작성하시오
        int age = scan.nextInt();
        if(age >= 19){
            System.out.println("성인");
        }
        System.out.println("종료");
    }
}
