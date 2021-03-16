package org.itstep.annotations;

import java.lang.reflect.Field;

/*
Retention policy:
source - доступен в период компиляции (при написании кода)
class - доступен в период компиляции (.java - .class)
runtime - доступен в период работы приложения

Target:
TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE, ANNOTATION_TYPE
TYPE - class
LOCAL_VARIABLE - inner method variable
ANNOTATION_TYPE - annotation
PACKAGE - package

Annotation - metadata
Которая обрабатывается процессорами
процессор ищет аннотации, если нужно - берет из них методату,
производит логику написанную в процессоре
 */
@ClassAnnotation(
        redirectClass = StandardJavaAnnotations.class
)
public class AnnotationExample {

    @FieldAnnotation(
            defaultValue = "Message"
    )
    private String field = "Some other something";

    @MethodAnnotation
    public void doSomething() {}

    @Deprecated
    public void beforeDoSomething() {}

    public static void main(String[] args) throws Exception {
        Class<?> redirectClass = AnnotationExample.getRedirectClass();

        Object o = redirectClass.getConstructor().newInstance();

        System.out.println(o);

        System.out.println(redirectClass.getSimpleName());

        AnnotationExample an = new AnnotationExample();

        System.out.println(an.getField());

        AnnotationExample.injectMessageInField(an);

        System.out.println(an.getField());
    }

    public static Class<?> getRedirectClass() {
        ClassAnnotation ca = AnnotationExample.class.getAnnotation(ClassAnnotation.class);
        return ca.redirectClass();
    }

    public static <T> void injectMessageInField(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field f : fields) {
            if (f.isAnnotationPresent(FieldAnnotation.class)) {
                FieldAnnotation fa = f.getAnnotation(FieldAnnotation.class);
                f.setAccessible(true);
                f.set(t, fa.defaultValue());
            }
        }
    }

    public String getField() {
        return field;
    }
}
