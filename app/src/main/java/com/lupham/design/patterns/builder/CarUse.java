package com.lupham.design.patterns.builder;

/**
 * Created by LuPham on 6/21/2015.
 */
public class CarUse {
    public static void test() {
        Car car = new Car.Builder()
                .setBrand("Toyota")
                .setSeats(4)
                .setColor("Silver")
                .build();

        car.driving();
    }
}
