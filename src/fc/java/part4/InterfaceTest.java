package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;
import fc.java.poly.Tv;

// 인터페이스에서 사용하는 final static 상수
public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 Tv를 동작시켜보자
        // 다형성이 보장이 된다.
        // 부모가 인터페이스이면 자식의 내부 동작 방식을 전혀 몰라도 동작을 시킬 수가 있다.
        // RemoCon r = new RemoCon(); 객체 생성 불가
        // 하지만, 부모의 역할을 할 수 있다.
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        //remo.internet(); // ?

        remo = new Tv();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        //remo.internet(); // ?
    }
}
