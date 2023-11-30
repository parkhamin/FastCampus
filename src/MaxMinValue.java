// 삼항연산자 : 연산자의 수가 3개인 삼항연산자
public class MaxMinValue {
    public static void main(String[] args) {
        // Q. 삼항 연산자를 이용하여 정수 2개 중 max value와 min value를 출력하시오
        int a = 10;
        int b = 20;

        // max value
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);

        // min value
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);;
    }
}
