package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Racingcar rc = new Racingcar();
        v.display_typeOfVehicle();
        c.display_typeOfVehicle();
        rc.display_typeOfVehicle();
    }
}
