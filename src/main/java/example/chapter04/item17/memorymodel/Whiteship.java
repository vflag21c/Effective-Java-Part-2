package example.chapter04.item17.memorymodel;

public class Whiteship {

    private final int x;

    private final int y;

    public Whiteship() {
        this.x = 1;
        this.y = 2;
    }

    public static void main(String[] args) {
        // Object w = new Whiteship()
        // whiteship = w // 불안전한 초기화 발생할 수 있다.. 이론 상으론.. ( final 을 사용하게 될 경우 초기화 이후 사용 가능 )
        // w.x = 1
        // w.y = 2

        Whiteship whiteship = new Whiteship();
    }


}
