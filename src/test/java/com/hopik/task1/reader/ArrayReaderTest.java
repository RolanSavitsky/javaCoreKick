package com.hopik.task1.reader;

import com.hopik.task1.exception.ArrayException;
import com.hopik.task1.reader.impl.ArrayReaderImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayReaderTest {
    private static final String VALID_PATH = "data/input.txt";
    private static final String INVALID_PATH = "data/notInput.txt";

    private final ArrayReader arrayReader = new ArrayReaderImpl();

    @Test
    void shouldPositiveReadLines() throws ArrayException {
        List<String> lines = arrayReader.readLinesFromFile(VALID_PATH);

        assertAll(
                () -> assertNotNull(lines),
                () -> assertFalse(lines.isEmpty())
        );
    }

    @Test
    void shouldNegativeReadLines() {
        ArrayException exception = assertThrows(
                ArrayException.class,
                () -> arrayReader.readLinesFromFile(INVALID_PATH)
        );
        assertTrue(exception.getMessage().contains("No file found"));
    }
}
