package com.akash.creational.abstract_factory;

class BikeWheelFactory extends WheelFactory {

    @Override
    Wheel makeWheel() {
        return new BikeWheel();
    }

    @Override
    WheelFittingExpert makeFittingExpert() {
        return new BikeExpert();
    }
}