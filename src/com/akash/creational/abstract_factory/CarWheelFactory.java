package com.akash.creational.abstract_factory;

class CarWheelFactory extends WheelFactory {

    @Override
    Wheel makeWheel() {
        return new CarWheel();
    }

    @Override
    WheelFittingExpert makeFittingExpert() {
        return new CarExpert();
    }
}