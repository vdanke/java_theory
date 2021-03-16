package org.itstep.patterns.methodfactory;

import org.itstep.patterns.factory.Factory;
import org.itstep.patterns.factory.obj.FirstMessage;
import org.itstep.patterns.factory.obj.Message;

public class FirstMessageFactory implements FactoryMethod {

    @Override
    public Message create() {
        return new FirstMessage();
    }
}
