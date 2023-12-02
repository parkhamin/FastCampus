package fc.java.part2;

// 매개변수 전달기법
public class CallByReference {
    // 1. Call By Valle(값 전달)
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    // 2. Call By Reference(번지 전달) -> 자바는 거의 Call By Reference 사용
    public static int add(int[] a){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = add(3, 7);
        System.out.println("result1 = " + result1);

        int[] array = {3, 5, 3, 1, 2, 5, 8, 4, 2, 9, 6, 7};
        int result2 = add(array);
        System.out.println("result2 = " + result2);
    }
}
