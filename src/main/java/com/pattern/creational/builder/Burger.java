package com.pattern.creational.builder;

/**
 *
 * @author giord
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
