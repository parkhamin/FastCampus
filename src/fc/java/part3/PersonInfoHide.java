package fc.java.part3;

import fc.java.model.PersonVO;

// 정보 은닉이란? : 다른 객채에게 자신의 정보를 숨기고 자신의 동작, 기능, 연산만을 통해 접근을 허용하는 것으로,
//                클래스 외부에서 특정 정보에 접근을 막는다는 의미

public class PersonInfoHide {
    public static void main(String[] args) {
        // person vo 클래스의 변수들의 접근제어자가 private기 때문에 오류가 남.
//        // Q. 한 사람의 회원 정보를 저장할 객체를 생성하세요.
//        PersonVO vo = new PersonVO();
//        vo.name = "홍길동";
//        vo.age = 5000; // 정보 은닉 되지 않음
//        vo.phone = "010-1111-1111";
//
//        System.out.println(vo.name + "\t" + vo.age + "\t" + vo.phone);
    }
}
