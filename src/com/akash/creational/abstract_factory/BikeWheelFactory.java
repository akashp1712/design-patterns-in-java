package com.akash.creational.abstract_factory;

class BikeWheelFactory implements WheelFactory {

    public Wheel makeWheel() {

        return new BikeWheel();
    }

    public WheelFittingExpert makeFittingExpert() {

        return new BikeExpert();
    }
}