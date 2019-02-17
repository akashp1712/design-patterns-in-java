package com.akash.creational.builder;

class Door {
    private float height;
    private float width;
    private String color;

    private Door(final Builder builder) {
        height = builder.height;
        width = builder.width;
        color = builder.color;
    }

    static class Builder {
        private float height;
        private float width;
        private String color;

        Builder setHeight(final float height) {
            this.height = height;
            return this;
        }

        Builder setWidth(final float width) {
            this.width = width;
            return this;
        }

        Builder setColor(final String color) {
            this.color = color;
            return this;
        }

        Door create() {
            return new Door(this);
        }
    }
}