package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    // 오버로딩(Overloading) : 메서드의 이름은 같지만 인수의 타입이 다르다.
    // 다른 타입의 메서드를 사용하려면 같은 이름의 메서드를 계속 만들어야한다는 것이 단점.
    private static void display(Animal ani) { // 다형성인수 : 하나의 타입으로 여러가지 타입을 받을 수 있다.(부모이기 때문)
        ani.eat();
        if(ani instanceof Cat){ // 인수로 받은 타입이 Cat일때만
            ((Cat)ani).night(); // night 메서드를 호출
        }
    }
}

