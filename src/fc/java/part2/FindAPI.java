package fc.java.part2;

public class FindAPI {
    public static void main(String[] args) {
        int a; // 변수 선언
        a = 10;
        System.out.println("a = " + a);
        
        // "APPLE" 문자열 저장하고 출력
        java.lang.String s = "APPLE"; // String 자료형은 컴파일러가 가지고 있는 어휘 단어 목록에 찾아봐도 없다.
                                     // -> 그 다음에 Java에서 기본적으로 제공해주는 API를 찾아간다. (API의 위치 -> 좌측의 External Libraries)
                                     // -> 사용자 정의 자료형
        System.out.println("s = " + s);
        System.out.println(s.length());
        
    }
}
