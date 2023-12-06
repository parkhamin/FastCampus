package fc.java.model;

public class Dog extends Animal{
    public Dog(){
        super(); // new animal() super 키워드는 항상 첫번째 줄에 있어야 함.
    }

    public void eat(){ // 재정의(Override)
        System.out.println("개처럼 먹다.");
    }
}
