package org.itstep.generics;

import org.itstep.generics.entity.Business;
import org.itstep.generics.entity.Good;
import org.itstep.generics.entity.Student;
import org.itstep.generics.util.ObjectToJson;
import org.itstep.generics.wildcards.Mark;

public class ParameterRunner {

    public static void main(String[] args) throws Exception {
        String str = ObjectToJson.convertToJson(new Good(1, "student"));

        System.out.println(str);

        Student student = ObjectToJson.convertToObject("student", Student.class);

        System.out.println(student);

        Business business = ObjectToJson.convertToObject("business", Business.class);

        System.out.println(business);

        Mark<Integer> first = new Mark<>(5);
        Mark<Double> second = new Mark<>(5.0);

        boolean equalWithoutType = first.isEqualWithoutType(second);
        System.out.println(equalWithoutType);
//        first.isEqual(second); compile error

        Double d = Mark.createInstance(Double.class);
    }
}
