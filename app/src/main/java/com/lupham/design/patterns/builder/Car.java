package com.lupham.design.patterns.builder;

import android.util.Log;

/**
 * Created by LuPham on 6/21/2015.
 */
public class Car {
    private String brand;
    private int seats;
    private String color;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.seats = builder.seats;
        this.color = builder.color;
    }

    public void driving(){
        Log.v("CAR","DRIVING");
    }

    public static class Builder {
        private String brand;
        private int seats;
        private String color;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}
