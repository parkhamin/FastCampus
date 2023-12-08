package fc.java.poly;

public class Board extends Object{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Override(재정의)
    public String toString(){
        return title; // 문자열
    }
}
