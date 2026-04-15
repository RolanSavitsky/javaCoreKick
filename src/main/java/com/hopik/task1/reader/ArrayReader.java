package com.hopik.task1.reader;

import com.hopik.task1.exception.ArrayException;

import java.util.List;

public interface ArrayReader {
    List<String> readLinesFromFile(String filePath) throws ArrayException;
}
