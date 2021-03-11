package org.itstep.convention;

/*
State - first (Constants before)
Block of code - second
Constructor - third
Methods - fourth
Get, Set methods - fifth
Object methods - sixth
 */
public class ConventionExample {

    private static final String CONSTANT = "Constant";

    private String first;
    private String second;

    static {

    }

    {

    }

    public ConventionExample() {
    }

    // Method argument not more than 4-5
    public boolean checkCommonLength() {
        return this.first.length() + this.second.length() < 15;
    }

    public static String getCONSTANT() {
        return CONSTANT;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
