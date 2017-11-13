package com.yjyx.designModel;


//具体产品类2角色   继承 Moveabl
public class Broom implements Moveable{
    public void check() {
        System.out.println("check the condition of today weather..");

    }

    public void record() {
        System.out.println("centos version...");

    }

    public void run() {
        System.out.println("Broom  is runing ...");

    }
}
