package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        // Q. 영화 3편을 저장할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력하시오
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[0].mtitle = "A영화";
        m[0].mmajor = "박하민";
        m[0].mtime = 160;
        m[0].mlevel = 15;
        m[0].mday = "2023-01-15";

        m[1] = new Movie();
        m[1].mtitle = "B영화";
        m[1].mmajor = "박하민";
        m[1].mtime = 180;
        m[1].mlevel = 12;
        m[1].mday = "2023-01-11";

        m[2] = new Movie();
        m[2].mtitle = "A영화";
        m[2].mmajor = "박하민";
        m[2].mtime = 140;
        m[2].mlevel = 18;
        m[2].mday = "2022-11-16";

        for(int i=0; i<m.length; i++){
            System.out.println(m[i].mtitle + "\t" + m[i].mmajor + "\t" + m[i].mtime + "\t" + m[i].mlevel + "\t" + m[i].mday);
        }
    }
}
