package fc.java.part3;

import fc.java.model.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        // Q. 객체 배열을 이용하여 4명의 학생(Student) 데이터를 저장하고 출력하세요.
        StudentVO[] std = new StudentVO[4];
        std[0] = new StudentVO("홍길동","컴공",33,"hong@naver.com",2023110,"010-1111-1111");
        std[1] = new StudentVO("나길동","전기",43,"na@naver.com",2023111,"010-1111-2222");
        std[2] = new StudentVO("김길동","건축",25,"kim@naver.com",2023112,"010-1111-3333");
        std[3] = new StudentVO("이길동","통신",51,"lee@naver.com",2023113,"010-1111-4444");

        for(int i=0; i<std.length; i++){
            System.out.println(std[i].toString());
        }

        for(StudentVO st: std)
            System.out.println(st.toString());
    }
}
