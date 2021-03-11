package org.itstep.obj;

public class ObjectMethodExample implements Cloneable {

    private String state;

    public ObjectMethodExample(String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        final int random = 42;
        return random * state.length();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ObjectMethodExample)) {
            return false;
        }
        ObjectMethodExample inc = (ObjectMethodExample) obj;
        if (this.state == null && inc.getState() == null) {
            return true;
        }
        if (inc.getState() == null || this.state == null) {
            return false;
        }
        return state.equals(inc.getState());
    }

    @Override
    protected ObjectMethodExample clone() throws CloneNotSupportedException {
        ObjectMethodExample m = (ObjectMethodExample) super.clone();
        m.reset();
        return m;
    }

    private void reset() {
        this.state = null;
    }

    @Override
    public String toString() {
        return String.format("State: %s", this.state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
