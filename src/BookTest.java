public class BookTest {
    public static void main(String[] args) {
        // 개발자가 다루는 데이터는 거의 다 객체데이터이다.
        // 객체데이터는 하나의 구조(변수)로 이루어진 데이터가 아니라 여러 개의 구조(여러 개의 변수)로  이루어진 데이터이다.
        // 이런 객체데이터를 변수에 저장하기 위해서는 새로운 자료형이 필요하기 때문에 개발자가 직접 자료형을 만들어서 사용할 수 있다.(객체지향프로그래밍)

        // class란? -> 새로운 자료형을 만드는, 설계하는, 모델링하는 도구

        // Q. 한 권의 책 데이터를 저장하고 출력하시오. 6개의 변수로
        String title = "자바";
        int price = 30000;
        String company = "패스트캠퍼스";
        String author = "박매일";
        int page = 700;
        String isbn = "ISBN-111990011";

        System.out.println(title+"\t"+price+"\t"+company+"\t"+author+"\t"+page+"\t"+isbn);

        // Q. 책 한 권을 저장할 변수를 선언하시오
        Book b;
    }
}
