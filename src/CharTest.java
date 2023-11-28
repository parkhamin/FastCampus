public class CharTest {
    public static void main(String[] args) {
        // 문자자료형(char) : Java에서 수치자료형으로 간주됨
        // 아스키코드 : 문자를 어떤 숫자로 나타낼지 약속으로 나타낸 코드. 0부터 127까지 128가지의 문자를 숫자로 나타낼 수 있음.
        // -> '0' = 48, '1' = 49
        // 비영어권에서는 아스키코드로 문자를 다 표현할 수 없음 -> 유니코드를 사용

        char c = 'A';
        System.out.println("c = " + c);

        int a = 'A';
        System.out.println("a = " + a);

        int b = 'B' + 1;
        System.out.println("b = " + (char)b);

        // Q. '가'라는 한글 한 문자를 변수에 저장하고 출력하시오
        char han = '가';
        System.out.println("han = " + han);
        int hanD = '가';
        System.out.println("hanD = " + hanD);
        int hunU = '\uAC00';
        System.out.println("hunU = " + hunU);

        // Q. 대문자 'A'를 문자 'a'로 변환하여 출력하시오
        char upper = 'A';
        char lower = (char)(upper + 32);
        System.out.println("lower = " + lower);

        char lower1 = 'u';
        char upper1 = (char)(lower1-32);
        System.out.println("upper1 = " + upper1);

        // Q. '1' + '2' = 3이 나오도록 프로그래밍하시오
        int data = '1' + '2';
        System.out.println("data = " + data); //99

        // '0' = 48
        char i = '1'; // 49
        char j = '2'; // 50
        int sum =(i-'0')+(j-'0');
        System.out.println("sum = " + sum);

    }
}
