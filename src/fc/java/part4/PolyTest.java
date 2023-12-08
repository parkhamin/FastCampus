package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

/*
    - 다형성 전제조건
    1. 상속 관계
    2. Override(재정의)
    3. Upcasting(업케스팅)
    4. 동적바인딩
 */

public class PolyTest {
    public static void main(String[] args) {
        // UpCasting으로 객체를 생성
        // 상속 관계, 재정의(Override), 동적바인딩
        // 다형성(message polymorphism)
        // -> 상위 클래스가 동일한 메시지로 하위 클래스를 서로 다르게 동작 시키는 객체지향 이론
        Animal ani = new Dog();
        ani.eat(); // "개처럼 먹는다" 출력, 실행 시점에서 사용될(호출될) 메서드가 결정되는 바인딩(동적바인딩)

        ani = new Cat();
        ani.eat(); // "고양이처럼 먹는다" 출력

        // DownCasting
        ((Cat)ani).night();

        // Overloading(오버로딩) : 정적바인딩 -> 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
        // -> 프로그램의 실행 속도와는 무관
        // Override(재정의) : 동적바인딩 -> 실행 시점에서 사용될(호출될) 메서드가 결정되는 바인딩
        // -> 프로그램의 실행 속도와
    }
}
