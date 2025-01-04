package example.chaptor05.item26.raw;

public class UseRawType<E> {

    private E e;

    // 요 두가지 경우의 수를 제외 하곤 매개변수와 타입을 지정하는 것이 좋다.
    public static void main(String[] args) {
        System.out.println(UseRawType.class);

        UseRawType<String> stringType = new UseRawType<>();

        System.out.println(stringType instanceof UseRawType);
    }
}
