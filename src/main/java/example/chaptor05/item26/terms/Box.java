package example.chaptor05.item26.terms;

public class Box<E extends Number> { // 한정적 타입 매개변수

    private E item;

    private void add(E e) {
        this.item = e;
    }

    private E get() {
        return this.item;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.add(13);
        System.out.println(box.get() * 100);

        printBox(box);
    }

    private static void printBox(Box<?> box) { // 비 한정적 와일드카드 == ? extends Object
        System.out.println(box.get());
    }

}
