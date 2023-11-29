public class TwoDimArrayTest {
    public static void main(String[] args) {
        int[][] a = new int[2][4];

        a[0][0] = 10;
        a[0][1] = 20;
        a[0][2] = 30;
        a[0][3] = 40;

        a[1][0] = 50;
        a[1][1] = 60;
        a[1][2] = 70;
        a[1][3] = 80;

        System.out.println(a[0][0] + "\t" + a[0][1] + "\t" + a[0][2] + "\t" + a[0][3]);
        System.out.println(a[1][0] + "\t" + a[1][1] + "\t" + a[1][2] + "\t" + a[1][3]);

        System.out.println(a.length); // 행의 길이인 2
        System.out.println(a[0].length); // 0행의 열의 길이인 4
        System.out.println(a[1].length);
    }
}
