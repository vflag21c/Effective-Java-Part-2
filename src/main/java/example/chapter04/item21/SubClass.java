package example.chapter04.item21;

public class SubClass extends SuperClass implements MarkerInterface {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.hello(); // private 임에도 실행하려고 한다. ( 클래스가 인터페이스 보다 우선 )

    }

}
