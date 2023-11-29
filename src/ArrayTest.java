public class ArrayTest {
    public static void main(String[] args) {
        // Q. 정수 5개를 저장 할 배열을 생성하고 모든 원소에 10을 저장하고 출력하시오
        int[] a = new int[5];

        for(int i=0; i<a.length; i++){
            a[i] = 10;
            System.out.println(a[i]);
        }

        // Q. 정수 5개를 앛=래처럼 배열에 초기화하고 index 0번째와 index 3번째 값을 더하여 출력하시오
        int[] b = {10, 20, 30, 40, 50}; // 배열 초기화
        int sum = b[0] + b[3];
        System.out.println("sum = " + sum);
        System.out.println(b.length);

        //
        int[] c = new int[3];
        System.out.println(c[0]); // 0
        System.out.println(c[1]); // 0
        System.out.println(c[2]); // 0


    }
}
