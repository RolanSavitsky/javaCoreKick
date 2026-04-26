package com.hopik.task1.observer;

import com.hopik.task1.entity.CustomArrayWrapper;

import java.util.EventObject;

public class ArrayEvent extends EventObject {

    public ArrayEvent(Object source) {
        super(source);
    }

    @Override
    public CustomArrayWrapper getSource(){
        return (CustomArrayWrapper) super.getSource();
    }
}
