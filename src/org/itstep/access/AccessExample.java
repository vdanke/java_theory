package org.itstep.access;

/*
Class access modifiers
1. public - all packages
2. default ('') - package visibility
 */
class AccessExample {

    // cannot be accessed outside the class
    private String first;
    // package and inheritance visibility
    protected String second;
    // all visibility
    public String third;
    // package visibility
    String fourth;
}
