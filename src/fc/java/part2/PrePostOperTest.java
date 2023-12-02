package fc.java.part2;

// 증가연산자, 감소연산자
// 증감 연산자의 위치에 따라 전위, 후위로 나뉨
// 전위인 경우 연산 후 사용
// 후위인 경우 사용 후에 연산을 나중에
public class PrePostOperTest {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(--x); // 연산 먼저 -> 9
        System.out.println(x++); // x 사용 후 연산 -> 출력문은 9지만 현재 메모리에 x는 10인 상태
        System.out.println(x--); // x 사용 후 연산 -> x는 10이었으므로 10 출력 후 연산하여 메모리에 x는 9인 상태
        System.out.println(++x); // 연산 먼저 하고 사용하므로 10
        System.out.println(x); // 10
    }
}
