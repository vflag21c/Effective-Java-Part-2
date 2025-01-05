package example.chaptor05.item27.annotation;

import java.lang.annotation.*;

//@Retention(RetentionPolicy.SOURCE)
@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyAnnotation {

}
