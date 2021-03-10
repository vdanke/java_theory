package org.itstep;

import org.itstep.memory.*;
import org.itstep.variables.ObjectVariablesTypes;
//import org.itstep.memory.Car;
//import org.itstep.memory.ViewCar;

public class Main {

    /*
    ctrl + E - Tree of project
    shift + ESC - Close the menu
    x2 shift - Searching
    ctrl + shift + f10 - Run the current main method
    shift + f10 - Run the last main method
    shift + f6 - Rename anything
    */
    public static void main(String[] args) {
        System.out.println("Hello world");

        Car car = new Car("type", "engine");

        ViewCar viewCar = new ViewCar();

        viewCar.showCarCharacteristics(car);
    }
}
