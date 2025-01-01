package example.chaptor05.item26.terms;

import java.util.ArrayList;
import java.util.List;

public class GenericBasic {

    public static void main(String[] args) {
        // Generic 사용하기 전 - 런타임 시 에러 탐지
//        List numbers = new ArrayList();
//        numbers.add(10);
//        numbers.add("whiteship");
//
//        for (Object number: numbers) {
//            System.out.println((Integer)number);
//        }

        // Generic 등장 이후
        List<Integer> nuberms = new ArrayList<>();
        nuberms.add(10);
//        nuberms.add("whiteship"); // 컴파일 에러 발생

        for (Integer number: nuberms) {
            System.out.println(number);
        }
    }
}
