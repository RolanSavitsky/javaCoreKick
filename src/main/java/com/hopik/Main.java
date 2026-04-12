package com.hopik;

import com.hopik.entity.Entity;
import com.hopik.file.ArrayFactory;
import com.hopik.file.ReaderFile;
import com.hopik.file.ParserFile;
import com.hopik.service.AverageService;
import com.hopik.service.MinMaxService;
import com.hopik.service.SortService;
import com.hopik.service.SumService;
import com.hopik.service.impl.AverageServiceImpl;
import com.hopik.service.impl.MinMaxServiceImpl;
import com.hopik.service.impl.SortServiceImpl;
import com.hopik.service.impl.SumServiceImpl;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    static void main() {
        ReaderFile reader = new ReaderFile();
        ParserFile parser = new ParserFile();
        ArrayFactory factory = new ArrayFactory();

        MinMaxService minMaxService = new MinMaxServiceImpl();
        SumService sumService = new SumServiceImpl();
        AverageService averageService = new AverageServiceImpl();
        SortService sortService = new SortServiceImpl();

        Path filePath = Paths.get("data/input.txt");

        try {
            List<String> lines = reader.readLines(filePath);

            for (String line : lines) {
                try {
                    int[] data = parser.parse(line);

                    Entity entity = factory.create(data);

                    System.out.println("Massive");
                    System.out.println("Min: " + minMaxService.calculateMin(entity));
                    System.out.println("Max: " + minMaxService.calculateMax(entity));
                    System.out.println("Sum: " + sumService.calculateSum(entity));
                    System.out.println("Average: "+ averageService.calculateAverage(entity));

                } catch (Exception e) {
                    System.err.println("Line error: " + line + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.err.println("File error: " + e.getMessage());
        }
    }
}