package fc.java.poly;

public class Tv implements RemoCon {
    //chUp(), chDown(), volUp(), volDown()
    @Override
    public void chUp() {
        System.out.println("Tv 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("Tv 채널이 내려간다.");
    }

    @Override
    public void volUp() {
        System.out.println("Tv 볼륨이 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("Tv 볼륨이 올라간다.");
    }

    @Override
    public void internet() {
        System.out.println("Tv에서는 인터넷이 실행된다.");
    }
}
