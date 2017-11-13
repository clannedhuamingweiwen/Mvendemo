package com.yjyx.designModel;

public class PlaneFactory extends VehicleFactory{

    @Override
    Moveable check() {
        return new Plane();
    }

    @Override
    Moveable record() {
        return new Plane();
    }

    @Override
    Moveable create() {
        return new Plane();


    }
}
