package com.hopik.task1.validator.impl;

import com.hopik.task1.validator.ArrayValidator;

public class ArrayValidatorImpl implements ArrayValidator {
    private static final String FILE_ARRAY_PATTERN = "^[\\d\\s,;\\-]+$";

    public boolean isLineValid (String line){
        return line != null && line.matches(FILE_ARRAY_PATTERN);
    }
}
