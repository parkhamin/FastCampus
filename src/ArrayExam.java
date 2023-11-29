public class ArrayExam {
    public static void main(String[] args) {
        // Q. 아래 char[] 배열에 APPLE이라는 문자가 저장되어 있다. 대문자로 된 APPLE을 소문자 apple로 출력하시오
        char[] c = {'A', 'P', 'P', 'L', 'E'};

        for(int i=0; i<c.length; i++){
            System.out.print((char)(c[i]+32));
        }
    }
}
