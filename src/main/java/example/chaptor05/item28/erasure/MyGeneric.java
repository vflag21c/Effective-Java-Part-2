package example.chaptor05.item28.erasure;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("asdfasdfasdf");
        String name = names.get(0);
        System.out.println(name);


//        List names = new ArrayList();
//        names.add("aaa");
//        Object o = names.get(0);
//        String name = (String) o;
    }

}
