package org.itstep.oop.solid.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

// Каждый класс имеет один уровень ответственности
public class SingleResponsibility {

    public Collection<String> getAllFromDB() {
        // query
        // connection
        return new ArrayList<>(Arrays.asList("f", "s"));
    }

    public Collection<String> processBusinessLogic() {
        // business logic
        return getAllFromDB();
    }
}
