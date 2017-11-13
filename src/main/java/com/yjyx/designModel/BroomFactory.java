package com.yjyx.designModel;

public class BroomFactory extends VehicleFactory {
    @Override
    Moveable check() {
        return new Broom();
    }

    @Override
    Moveable record() {
        return new Broom();
    }

    @Override
    Moveable create() {
        return new Broom();


    }
}
