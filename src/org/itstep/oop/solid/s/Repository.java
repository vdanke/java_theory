package org.itstep.oop.solid.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Repository {

    public Collection<String> getAllFromDB() {
        return new ArrayList<>(Arrays.asList("f", "s", "t"));
    }
}
