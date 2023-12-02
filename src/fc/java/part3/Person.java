package fc.java.part3;

/*
    클래스란 무엇인가? 현실세계에 있는 객체를 객체지향 프로그램에서 사용하기 위해
    객체의 상태 정보(멤버 변수)와 행위 정보(멤버 메서드)를 뽑아서 설계하는 도구
    객체(사람, 책, 영화 ...) = 상태 정보(멤버 변수) + 행위 정보(멤버 메서드)
*/

public class Person {
    public String name;
    public int age;
    public String phone;

    public void play(){
        System.out.println("운동을 한다.");
    }

    public void eat(){
        System.out.println("음식을 먹다.");
    }

    public void walk(){
        System.out.println("걷다.");
    }
}
