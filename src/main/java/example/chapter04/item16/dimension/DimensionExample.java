package example.chapter04.item16.dimension;

import java.awt.*;
import java.util.Comparator;
import java.util.function.BiFunction;

public class DimensionExample {

    public static void main(String[] args) {
        Button button = new Button("hello button");
        button.setBounds(0, 0, 20, 10);

        Dimension size = button.getSize();
        System.out.println(size.height); // public field
        System.out.println(size.width);

        doSomting(size);
    }

    private static void doSomting(Dimension dimension) {
        Dimension dimension1 = new Dimension();
        dimension1.width = 10;
        //....
    }

}
