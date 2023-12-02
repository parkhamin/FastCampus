package fc.java.part3; // package 선언문
// DTO : Data Transfer Object

/*
    Q. 한 개의 정수 데이터를 저장하기 위한 변수 -> int a
    Q. 한 개의 실수 데이터를 저장하기 위한 변수 -> float a
    Q. 한 개의 문수 데이터를 저장하기 위한 변수 -> char a
    Q. 한 권의 책 데이터를 저장하기 위한 변수 -> ? = BookDTO
    Q. 한 명의 헬스 클럽 회원 데이터를 저장하기 위한 변수 -> ? = MemberDTO
    Q. 한 편의 영화 데이터를 저장하기 위한 -> ? = MovieDTO
    -> 사용자 정의 자료형(새로운 자료형, 객체 자료형)의 필요성 -> 만들기 위해서는 모델링도구 class 필요!
 */

public class BookDTO {
    public String title;
    public int price;
    public String company;
    public String author;
    public int page;
    public String isbn;
}
