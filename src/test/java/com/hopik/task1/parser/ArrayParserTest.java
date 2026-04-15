package com.hopik.task1.parser;

import com.hopik.task1.parser.impl.ArrayParserImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayParserTest {
    private static final String inputString = "1   3; 5 - 7, 4";
    private static final int[] expectedArray = {1,3,5,7,4};

    private final ArrayParser arrayParser = new ArrayParserImpl();

    @Test
    void shouldParseIsValidToString(){
        int [] actual = arrayParser.parseToArray(inputString);
        assertArrayEquals(expectedArray, actual);
    }
}