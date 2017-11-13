package com.yjyx.designModel;
/*

简单工厂模式主main测试类
 */
public class TestFact {
    public static void main(String[] args) {
        VehicleFactory ve = new BroomFactory();

//        Moveable m =ve.create();
//        m.run();
        System.out.println("测试--简单工厂模式");
        Moveable n =ve.check();
        n.check();
        n.record();



    }
}
