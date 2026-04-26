package com.hopik.task1.comporator;

import com.hopik.task1.entity.CustomArrayWrapper;

import java.util.Comparator;

public class ArrayIdComporator implements Comparator<CustomArrayWrapper> {

    @Override
    public int compare(CustomArrayWrapper o1, CustomArrayWrapper o2){
        return Long.compare(o1.getId(), o1.getId());
    }
}
