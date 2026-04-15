package com.hopik.task1.validator;

import com.hopik.task1.validator.impl.ArrayValidatorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayValidatorTest {

    private static final String VALID_LINE = "10, 12, 83, 4";
    private static final String INVALID_LINE = "10, 12, p3, 4";

    private final ArrayValidator arrayValidator = new ArrayValidatorImpl();

    @Test
    void shouldPositiveIsValid() {
        boolean isValid = arrayValidator.isLineValid(VALID_LINE);

        Assertions.assertTrue(isValid);
    }

    @Test
    void shouldNegativeIsValid() {
        boolean isValid = arrayValidator.isLineValid(INVALID_LINE);

        Assertions.assertFalse(isValid);
    }
}
