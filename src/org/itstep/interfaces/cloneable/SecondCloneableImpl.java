package org.itstep.interfaces.cloneable;

public class SecondCloneableImpl extends AbstractCloneableImpl {

    private String unique;

    public String getUnique() {
        return unique;
    }

    public void setUnique(String unique) {
        this.unique = unique;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(
                String.format("Clone for class %s is not supported",
                        this.getClass().getSimpleName())
        );
    }
}
