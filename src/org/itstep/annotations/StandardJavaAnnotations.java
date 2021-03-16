package org.itstep.annotations;

import org.itstep.anonymous.Message;

public class StandardJavaAnnotations {
    
    @SuppressWarnings("unchecked")
    public <T> void cast(T t) {
        Message message = new Message();
        T message1 = (T) message;
    }
}
