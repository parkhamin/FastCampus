package fc.java.part3;

/*
    객체(클래스) 상호 간에 접근 제어가 필요한 이유?
    -> 객체의 상태 정보는 중요하기 때문에 접근을 못하게 해야 된다. (정보 은닉)
    -> 객체의 행위 정보는 상호 작용을 해야 되기 때문에 접근을 허용한다.

    객체 상호간에 접근을 제어하는 방법
    -> 4가지의 접근 제한자를 사용한다.
    -> 클래스와 클래스 내부에서 만들어지는 멤버에 접근 제한자를 사용할 수 있다.

    1. public : 모든 패키지에서 접근 가능
    2. private : 모든 패키지에서 접근 불가 (자기 자신만 접근 가능)
    3. proteced : 상속 관계에서 하위 클래스(자식)에서 상위 클래스(부모) 접근 가능
    4. default : 동일한 패키지에서만 접근 가능
*/

public class PersonAccessTest {
    public static void main(String[] args) {
        // Q. Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.
        Person p = new Person();
        p.name = "박하민";
        p.age = 1000; // ?
        p.phone = "010-0000-1111";

        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);
    }
}
