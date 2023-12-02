package fc.java.part2;

public class CastingTest {
    public static void main(String[] args) {
        // 형 변환(Casting)이란? : 값의 타입을 다른 타입으로 변환하는 것
        // 1. 자동형변환(묵시적) : 작은 type이 큰 type에 저장되는 경우(예:byte->int)
        // 2. 강제형변환(명시적) : 큰 type이 작은 type에 저장되는 경우(얘:int->byte, 손실발생)
        // * boolean type은 형변환이 안 된다.

        float f1 = .1f; // 0.1
        System.out.println("f1 = " + f1);
        float f2 = 15f; // 15.0
        System.out.println("f2 = " + f2);
        float f3 = 3.14f;
        System.out.println("f3 = " + f3);
        double d1 = 123.4567;
        System.out.println("d1 = " + d1);

        float x = 15.6f;
        int y = (int)x; // 강제형변환(손실)
        System.out.println("y = " + y); // 15

        char c = 'A';
        int cc = c; // 자동형변환
        System.out.println("cc = " + cc); // 65

        int dd = 5;
        double ddd = dd; // 자동형변환
        System.out.println("ddd = " + ddd); // 5.0

        double dx = 14.67;
        int dy = (int)dx; // 강제형변환
        System.out.println("dy = " + dy); //14

    }
}
