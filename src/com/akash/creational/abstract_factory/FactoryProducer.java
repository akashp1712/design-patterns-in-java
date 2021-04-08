package com.akash.creational.abstract_factory;

public class FactoryProducer {

    public static WheelFactory getFactory(String factoryType) {

        switch (factoryType) {
            case "CarWheel":
                return new CarWheelFactory();

            case "BikeWheel":
            default:
                return new BikeWheelFactory();

        }
    }
}