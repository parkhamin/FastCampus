package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        // Animal[] ani = {new Dog(), new Cat()}; 이 구문도 가능
        Dog d = new Dog();
        Cat c = new Cat();
        // Dog와 Cat을 저장하는 배열을 만들자
        // 다형성 배열(상위타입 배열): 배열을 동일한 자료형만 저장 가능하지만 부모 타입의 배열은 자식 타입을 저장 가능하다.
        // (하나의 배열에 서로 다른 타입을 저장 가능)
        Animal[] ani = new Animal[2];
        ani[0] = d;
        ani[1] = c;
        display(ani);
    }

    private static void display(Animal[] ani){
        for(int i=0; i<ani.length; i++){
            ani[i].eat();
            if(ani[i] instanceof Cat){
                ((Cat)ani[i]).night();
            }
        }
    }
}
