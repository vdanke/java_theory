package org.itstep.patterns.methodfactory;

import org.itstep.patterns.factory.obj.Message;
import org.itstep.patterns.factory.obj.SecondMessage;

public class SecondMessageFactory implements FactoryMethod {

    @Override
    public Message create() {
        return new SecondMessage();
    }
}
