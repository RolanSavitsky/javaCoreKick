package com.hopik.task1.factory.impl;

import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.factory.ArrayFactory;

public class ArrayFactoryImpl implements ArrayFactory {

    @Override
    public CustomArrayWrapper createArray(int[] data) {
        return new CustomArrayWrapper(data);
    }
}