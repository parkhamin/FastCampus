package fc.java.part2;

public class LoopLoopTest {
    public static void main(String[] args) {
        int a[][]={
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.println(a[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i=2; i<10; i++){
            System.out.println("======="+i+"단=======");
            for(int j=1; j<10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
