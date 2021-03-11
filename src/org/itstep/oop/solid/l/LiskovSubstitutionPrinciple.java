package org.itstep.oop.solid.l;

public class LiskovSubstitutionPrinciple {

    public void principle() {
        SportCar c = new F1Car();

        showCar(c);
    }

    public void showCar(Car car) {
        car.driving();
    }
}
