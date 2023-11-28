public class CarTest {
    public static void main(String[] args) {
        //  자동차의 정보를 저장하려고 한다. 변수를 만들어 보시오
        String model = "BMW528i"; // String은 기본자료형이 아닌 Java에서 만들어서 제공해주는 자료형.
        System.out.println("model = " + model);
        long distance = 10000000000L; // int의 범위를 넘어갈 경우(21억 이상), 뒤에 L을 붙여주기
        System.out.println("distance = " + distance + "km");
        int price = 9000000;
        System.out.println("price = " + price);
        String company = "BMW";
        System.out.println("company = " + company);
        char type = 'A';
        System.out.println("type = " + type + "Type");
        boolean auto = true;
        System.out.println("auto = " + auto);
        int year = 2000;
        System.out.println("year = " + year);
        float gamsi = 12.5f;
        System.out.println("gamsi = " + gamsi + "l");

    }
}
