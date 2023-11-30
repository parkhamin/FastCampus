import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        // Q. 80점 이상의 학생 중에서 90점 이상은 A반, 85점 이상은 B반, 그렇지 않으면 C반으로 편성하고 
        // 점수가 80점 미만이면 불합격 처리하는 프로그램을 작성하시오
        
        int jumsu = 79;
        if(jumsu>=0 && jumsu <=100){
            if(jumsu >= 80){
                if(jumsu >= 90){
                    System.out.println("A반");
                } else if (jumsu >= 85) {
                    System.out.println("B반");
                }else{
                    System.out.println("C반");
                }
            }else{
                System.out.println("불합격");
            }
        }else{
            System.out.println("유효한 점수가 아닙니다.");
        }

        // Q. 년도를 입력 받아서 해당 년도가 윤년인지 아닌지를 판단하여 출력하는 코드를 작성하세요.
        // 윤년 : 4의 배수인 년도이거나(100으로 나누어 떨어지는 년도를 제외하고) 400의 배수인 년도
        Scanner scan = new Scanner(System.in);
        System.out.println("년도를 입력하세요: ");
        int year = scan.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("윤년이 아닙니다");
        }
    }
}
