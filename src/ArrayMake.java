public class ArrayMake {
    public static void main(String[] args) {
        // 동일한 데이터를 여러 개 저장할 수 있는 구조(동어리, 바구니, 객체)를 자바에서 배열(array)라고 한다.

        // Q. 정수 5개를 저장할 배열을 생성하시오
        int[] a = new int[5];

        //a[0] = 10;
        //a[1] = 10;
        //a[2] = 10;
        //a[3] = 10;
        //a[4] = 10;

        System.out.println(a.length); // 반복문을 사용할 때 용이함.

        for(int i=0; i<a.length; i++){
            a[i] = 10;
            System.out.println(a[i]);
        }

        float[] f = new float[5];

        Book[] b = new Book[3]; // 책 3권을 저정할 배열을 생성
    }
}
