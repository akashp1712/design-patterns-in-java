package com.akash.creational.builder;

class TestBuilder {
    public static void main(String[] args) {

        new Door.Builder()
                .setHeight(80)
                .setWidth(32)
                .setColor("gray")
                .create();

    }
}