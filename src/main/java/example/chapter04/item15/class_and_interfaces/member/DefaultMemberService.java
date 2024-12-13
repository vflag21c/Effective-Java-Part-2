package example.chapter04.item15.class_and_interfaces.member;

import java.util.Arrays;

class DefaultMemberService implements MemberService {

    private String name;

    private static class PrivateStaticClass {

        void doPrint() {
            //불가능 하지만 구조가 단순해지는 장점..
//            System.out.println(name);
        }
    }

    private class PrivateClass {

        void doPrint() {
            // 외부 클래스 변수 참조
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
    }

}
