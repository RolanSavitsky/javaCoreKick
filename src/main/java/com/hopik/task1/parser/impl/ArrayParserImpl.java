package com.hopik.task1.parser.impl;

import com.hopik.task1.parser.ArrayParser;

public class ArrayParserImpl implements ArrayParser {
    private final static String DELIMITER_REGEX = "[,;\\s\\-]+";

    @Override
    public int[] parseToArray(String line){
        String stripped = line.strip();

        String[] tokens = stripped.split(DELIMITER_REGEX);

        int[] array = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++){
            array[i] = Integer.parseInt(tokens[i]);
        }

        return array;
    }
}
