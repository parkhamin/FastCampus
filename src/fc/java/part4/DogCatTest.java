package fc.java.part4;

import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        // Q. Dog 객체를 생성하고 eat() 동작을 구동해보자.
        Dog d = new Dog();
        d.eat();

        // Q. Cat 객체를 생성하고 eat(), night() 동작을 구동해보자.
        Cat c = new Cat();
        c.eat();
        c.night();
    }
}
