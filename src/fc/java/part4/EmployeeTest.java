package fc.java.part4;

/*
    super class, 상위 클래스, 부모 클래스 (일반화, 추상화, 개념화, 포괄적)
                    extends(상속, 확장)
    sub class, 하위 클래스, 자식 클래스, 파생 클래스 (구체화, 세분화)

    * 상속을 사용하면 하위 클래스가 상위 클래스를 재활용 가능하다.
    -> 하위 클래스가 상위 클래스를 접근하여 사용 가능
 */

public class EmployeeTest {
    public static void main(String[] args) {
        // Q. [일반 사원] 한 명의 객체를 생성하고 데이터를 저장 후 출력을 하세요.
        RempVO vo = new RempVO("홍길동",33,"010-1111-1111","2023-12-07","홍보부",true);

        // 데이터 저장
        /* protected 쓸 때
        vo.name = "홍길동";
        vo.age = 50;
        vo.phone = "010-1111-1111";
        vo.empDate = "2023-12-07";
        vo.dept = "홍보부";
        vo.marriage = true;
         */

        //출력
        //System.out.println(vo.name + "\t" + vo.age + "\t" + vo.phone + "\t" + vo.empDate + "\t" + vo.dept + "\t" + vo.marriage);
        System.out.println(vo.toString());
    }
}
