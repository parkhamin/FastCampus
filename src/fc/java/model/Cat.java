package fc.java.model;

public class Cat extends Animal{

    public Cat(){
        super();
    }

    public void night(){
        System.out.println("밤에 눈에서 빛이 난다.");
    }

    public void eat(){ // 재정의(Override)
        System.out.println("고양이처럼 먹다.");
    }
}
