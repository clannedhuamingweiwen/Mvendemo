package com.yjyx.designModel.ObserModel;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject =new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);


        System.out.println("First state change: 15");
        subject.setState(9);
        System.out.println("Second state change: 10");
        subject.setState(11);





    }
}
