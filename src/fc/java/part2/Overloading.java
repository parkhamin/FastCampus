package fc.java.part2;

/*
    메서드의 오버로딩 : 하나의 클래스 내에서 동일한 이름의 메서드를 여러 개 사용할 수 있는 객체지향 기법
    오버로딩의 전제조건 -> 메서드의 시그니처가 달라야한다. (매개변수의 개수, 매개변수의 타입)
 */
public class Overloading {
    // Q. 매개변수로 두 개의 정수 값을 받아서 총합을 구하여 리턴하는 메서드를 정의하세요.
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    // Q. 매개변수로 두개의 실수 값을 받아서 총합을 구하여 리턴하는 메서드를 정의하세요.
    public static float add(float a, float b){
        float sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        float result1 = add(35.6f, 56.7f);
        System.out.println("result1 = " + result1);

        int result2 = add(10, 50);
        System.out.println("result2 = " + result2);
    }

    // 정적 바인딩이란? 컴파일 시점에서 사용될(호출될) 메서드가 결정(연결)되는 바인딩
    // -> 메서드의 오버로딩은 정적 바인딩으로 의해서 동작되기 때문에 실행 속도와는 무관하다.
}

