package com.yjyx.designModel;

//具体产品类2角色
public class Plane implements Moveable {

    public void run() {
        System.out.println("plane.....!");
    }


    public void check() {
        System.out.println("check is cheap");

    }

    public void record() {

        System.out.println("record is the dangerous");

    }
}
