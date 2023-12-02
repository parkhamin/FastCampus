package fc.java.part2;

/*
    메서드란? 객체가 가지고 있는 동작(기능)
    반복적인 동일 작업을 메서드를 만들어 사용하면 편리
    객체지향프로그램은 객체가 가지고 있는 메서드를 통해서 데이터를 서로 주고 받으며 상호작용을 한다.
    메서드는 크게 API에서 제공해주는 메서드와 사용자 정의 메서드의 두 종류로 분류할 수 있다.
    메서드는 정의를 하고 호출을 하여 사용되어진다.

    메서드는 변수다.
    메서드의 결과값은 하나의 형태로 만들어진다.
    변수는 데이터를 하나의 형태로 저장한다.
    메서드의 이름이 변수 역할을 한다.

    메서드는 클래스 내에서 독립적으로 만들어야 한다. (하나의 단위 작업을 처리)
 */
public class MethodMakeTest {
    public static void main(String[] args) { // main 함수에 static이 붙은 경우 메서드에서도 static을 선언해야한다.
        // add라는 메서드를 호출(call)하여 두 수의 합의 결과를 받아보자.
        int result = add(3, 5);
        System.out.println("result = " + result);
    }
    // Q. 매개변수로 2개의 정수를 받아서 총합을 구하여 리턴하는 메서드를 정의하세요.
    public static int add(int a, int b){ // 수행된 후에 반환하는 결과의 자료형, 아무 결과도 반환하지 않으면 자료형에 void를 씀
        int sum = a + b;
        return sum;
    }

}
