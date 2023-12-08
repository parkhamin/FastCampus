package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal--> Dog, Cat
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat(); // 업케스팅(Upcasting) : 하위 클래스를 상위 클래스로 받을 수 있다.
        ani.eat();
        // ani.night(); 다운케스팅(DownCasting) 필요 -> 다운케스팅 : 상위 클래스의 타입을 하위 클래스의 타입으로 바꾸는 행위
        // Cat c = (Cat)ani;
        // c.night();
        ((Cat)ani).night();
    }
}
