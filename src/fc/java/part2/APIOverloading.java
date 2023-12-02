package fc.java.part2;

public class APIOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");
        // -> 메서드의 오버로딩

        int max = maxValue(7, 9);
        System.out.println("max = " + max);

        int min = minValue(3, 8);
        System.out.println("min = " + min);
    }

        // Q. 두 개의 정수를 매개변수로 받아서 더 큰 수를 리턴하는 메서드를 정의하시오.
        public static int maxValue(int a, int b){
            return (a > b) ? a : b;
        }

        // Q. 두 개의 정수를 매개변수로 받아서 더 작은 수를 리턴하는 메서드를 정의하시오.
        public static int minValue(int a, int b){
            return (a < b) ? a : b;
        }
}
