package org.itstep.oop.solid.s;

import java.util.Collection;

public class Service {

    private Repository repository = new Repository();

    public Collection<String> processBusinessLogic() {
        return repository.getAllFromDB();
    }
}
