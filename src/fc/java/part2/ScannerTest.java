package fc.java.part2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        // Q. 키보드로부터 데이터를 입력받는 방법
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = scan.nextInt(); // 정수 입력, 블럭 상태
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요: ");
        float f = scan.nextFloat(); // 실수 입력
        System.out.println("f = " + f);

        System.out.print("문자열을 입력하세요: ");
        String str1 = scan.next(); // 문자열 입력(공백 앞까지 입력 받음)
        System.out.println("str1 = " + str1);

        scan.nextLine(); // 버퍼 비우기(스트림 비우기)

        System.out.print("문자열을 입력하세요: ");
        String str2 = scan.nextLine(); // 문자열 입력(엔터까지 입력 받음)
        System.out.println("str2 = " + str2);

        scan.close();

    }
}
