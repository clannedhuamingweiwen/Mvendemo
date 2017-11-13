package com.yjyx.designModel.ObserModel;

/**
 * 
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
