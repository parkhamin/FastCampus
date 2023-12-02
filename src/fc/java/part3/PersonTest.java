package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한 사람의 데이터를 저장할 변수를 선언하세요.
        //Person p; // 여기서 p란 객체, 객체 변수

        // Q. 사람의 이름, 나이, 전화번호를 저장할 객체를 생성하세요.
        //new Person();

        // Q. 생성된 객체를 변수에 할당(대입, 저장)하세요.
        // Q. 모델링 된 Person 클래스를 이용하여 객체를 메모리에 생성하세요.
        // [인스턴스를 만든느 과정]
        Person p = new Person(); // 여기서 p란 인스턴스 변수
        // 생성자 메소드(코드 14줄에서 new Person())란?
        // 1. new 연산에 의해서 호출이 된다.
        // 2. 자신이 가지고 있는 멤버들을 메모리에 올려 객체를 생성하는 역할
        // 3. 메서드 이름은 클래스 이름과 동일해야 한다.
        // 4. 접근 제한자가 public인 경우에만 호출이 된다.
        // 5. 모든 클래스는 기본 생성자를 가지고 있다.
        // 6. 객체의 초기화를 위해서 사용된다.
        // 7. 리턴 타입이 없다.

        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-1111-1111";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);

        p.play();
        p.eat();
        p.walk();
    }
}
