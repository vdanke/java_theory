package org.itstep.annotations;

import java.lang.annotation.*;

// Documented - будет отображение в Java doc
@Documented
// Inherited - все что будет помечено этой аннотацией
// перенимает свойства родителя
@Inherited
@Target(value = {ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassAnnotation {

    Class<?> redirectClass();
}
