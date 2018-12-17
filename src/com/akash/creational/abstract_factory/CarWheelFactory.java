package com.akash.creational.abstract_factory;

class CarWheelFactory implements WheelFactory {

    public Wheel makeWheel() {

        return new CarWheel();
    }

    public WheelFittingExpert makeFittingExpert() {

        return new CarExpert();
    }
}