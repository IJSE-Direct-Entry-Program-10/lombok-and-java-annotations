package lk.ijse.dep10.lombok;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Dep10Annotations.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Dep10Annotation {
    String name() default "";
    String contact() default  "";
    int id() default 15;

    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Dep10Annotations{

    Dep10Annotation[] value();
}


