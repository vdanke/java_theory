package org.itstep.interfaces.cloneable;

public class FirstCloneableImpl extends AbstractCloneableImpl {

    private String firstState;
    private String secondState;

    public void reset() {
        this.firstState = null;
        this.secondState = null;
    }

    public String getFirstState() {
        return firstState;
    }

    public void setFirstState(String firstState) {
        this.firstState = firstState;
    }

    public String getSecondState() {
        return secondState;
    }

    public void setSecondState(String secondState) {
        this.secondState = secondState;
    }

    /*
    deep clone - копирует все проперти в объекте
    clone - не копирует проперти, копирует лишь метадату
     */
    @Override
    protected FirstCloneableImpl clone() throws CloneNotSupportedException {
        FirstCloneableImpl cl = (FirstCloneableImpl) super.clone();
        cl.reset();
        return cl;
    }
}
