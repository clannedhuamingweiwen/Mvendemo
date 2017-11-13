package com.yjyx.designModel.ProxyModel;

public class RealImage implements Image{
    private String fileName;


    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }


    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }


}
