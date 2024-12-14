package example.chapter04.item17.part2;

public class StringExample {

    public static void main(String[] args) {
        String name = "youyouyouyou";

        //가변 동반 클래스
        StringBuilder nameBuilder = new StringBuilder(name);
        nameBuilder.append("yeolyeolyeol");
    }
}
