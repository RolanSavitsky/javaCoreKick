package com.hopik.task1.reader.impl;

import com.hopik.task1.exception.ArrayException;
import com.hopik.task1.reader.ArrayReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ArrayReaderImpl implements ArrayReader {

    @Override
    public List<String> readLinesFromFile(String filePath) throws ArrayException {
        Path path = Paths.get(filePath);

        if(!Files.exists(path)){
            throw new ArrayException("No file found: " + filePath);
        }
        try {
            return Files.readAllLines(path);
        } catch (IOException e){
            throw new ArrayException("File reading error: ", e);
        }
    }
}
