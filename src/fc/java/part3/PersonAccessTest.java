package fc.java.part3;

/*
    객체(클래스) 상호 간에 접근 제어가 필요한 이유?
    -> 객체의 상태 정보는 중요하기 때문에 접근을 못하게 해야 된다. (정보 은닉)
    -> 객체의 행위 정보는 상호 작용을 해야 되기 때문에 접근을 허용한다.
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
