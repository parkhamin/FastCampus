public class ForLoopTest {
    public static void main(String[] args) {
        // Q. 반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하시오
        for(int i=65; i<=90 ; i++){
            System.out.println((char)(i)+":"+i);
        }

        for(char c='A'; c<='Z'; c++){
            System.out.println(c+":"+(int)c);
        }

        // Q. int[] numbers={1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 배열 원소를 향상된 for문으로 출력하시오
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int num : numbers){
            System.out.println(num);
        }

    }
}
