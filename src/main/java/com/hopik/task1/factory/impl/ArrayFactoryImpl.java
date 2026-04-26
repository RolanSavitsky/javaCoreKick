package com.hopik.task1.factory.impl;

import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.factory.ArrayFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

public class ArrayFactoryImpl implements ArrayFactory {
    private static final Logger logger = LogManager.getLogger();

    @Override
    public CustomArrayWrapper createArray(int[] data) {
        logger.info("ArrayFactoryImpl is creating CustomArrayWrapper with data: {}", Arrays.toString(data));
        return new CustomArrayWrapper(data);
    }
}