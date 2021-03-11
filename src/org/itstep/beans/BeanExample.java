package org.itstep.beans;

public class BeanExample {

    private String state;
    private InnerBean innerBean;

    public BeanExample() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public InnerBean getInnerBean() {
        return innerBean;
    }

    public void setInnerBean(InnerBean innerBean) {
        this.innerBean = innerBean;
    }
}
