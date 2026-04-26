package com.hopik.task1.parser.impl;

import com.hopik.task1.exception.ArrayException;
import com.hopik.task1.parser.ArrayParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayParserImpl implements ArrayParser {
    private static final Logger logger = LogManager.getLogger();
    private final static String DELIMITER_REGEX = "[,;\\s\\-]+";

    @Override
    public int[] parseToArray(String line){

        String stripped = line.strip();
        String[] tokens = stripped.split(DELIMITER_REGEX);

        logger.debug("Tokens after split: {}", Arrays.toString(tokens));

        int[] array = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++){
            try {
                array[i] = Integer.parseInt(tokens[i]);
            } catch (NumberFormatException e) {
                logger.error("Failed to parse token: {}", tokens[i], e);
                throw new ArrayException("Invalid token", e);
            }
        }

        return array;
    }
}
