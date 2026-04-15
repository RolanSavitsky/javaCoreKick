package com.hopik.task1.factory;

import com.hopik.task1.entity.CustomArrayWrapper;

public interface ArrayFactory {
    CustomArrayWrapper createArray(int[] data);
}