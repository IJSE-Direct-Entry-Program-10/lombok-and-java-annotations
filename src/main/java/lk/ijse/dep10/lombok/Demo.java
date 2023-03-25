package lk.ijse.dep10.lombok;

import lombok.val;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnnotation
public class Demo {

    @MyAnnotation
    private int x;

    @Dep10Annotation("something")
    @Dep10Annotation(value = "ijse", name="IJSE", id=10)
    @MyAnnotation
    public static void main(@MyAnnotation String[] args) throws NoSuchMethodException {

        Method main = Demo.class.getDeclaredMethod("main", String[].class);
        Dep10Annotations dep10Annotations = main.getDeclaredAnnotation(Dep10Annotations.class);
        Dep10Annotation dep10Annotation = dep10Annotations.value()[1];
        System.out.println(dep10Annotation.name());

        System.out.println("Hello Lombok!");
        Student s1 = new Student(1, "Kasun", "011-1234567");
        Student s2 = new Student(1, "Kasun", "011-1234567");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("s1=s2 : " + (s1 == s2));        // false
        System.out.println("s1 equals s2 : " + (s1.equals(s2)));    // ?
        System.out.println("s1.hashCode() == s2.hashCode() : " + (s1.hashCode() == s2.hashCode()));
        System.out.println("---------------");
        System.out.printf("id=%s, name=%s, contact=%s \n", s1.getId(), s1.getName(), s1.getContact());
        s2.setId(2);
        s2.setName("Nuwan");
        s2.setContact("038-1234567");
        System.out.printf("id=%s, name=%s, contact=%s \n", s2.getId(), s2.getName(), s2.getContact());
    }
}
