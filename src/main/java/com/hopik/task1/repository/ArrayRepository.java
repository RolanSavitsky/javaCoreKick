package com.hopik.task1.repository;

import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.repository.specification.ArraySpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayRepository {
    private final static Logger logger = LogManager.getLogger();
    private static ArrayRepository instance;
    private final List<CustomArrayWrapper> ListArrays = new ArrayList<>();

    private ArrayRepository(){}

    public static ArrayRepository getInstance(){
        if (instance == null){
            instance = new ArrayRepository();
        }
        return instance;
    }

    public void addArray(CustomArrayWrapper customArrayWrapper){
        ListArrays.add(customArrayWrapper);
        logger.info("Entity added with id: {}", customArrayWrapper.getId());
    }

    public void removeArray(CustomArrayWrapper customArrayWrapper){
        ListArrays.remove(customArrayWrapper);
        logger.info("Entity removed with id: {}", customArrayWrapper.getId());
    }

    public List<CustomArrayWrapper> queryArrays (ArraySpecification specification){
        List<CustomArrayWrapper>results = new ArrayList<>();

        for (CustomArrayWrapper array : ListArrays){
            if (specification.specify(array)){
                results.add(array);
            }
        }
        logger.info("Query executed. Found {} arrays", results.size());

        return results;
    }

    public List<CustomArrayWrapper> queryArraysStream (ArraySpecification specification){
        List<CustomArrayWrapper> results = ListArrays.stream()
                .filter(specification::specify)
                .toList();
        logger.info("Query executed. Found {} arrays", results.size());

        return results;
    }

    public void sortArrays(Comparator<CustomArrayWrapper> comparator){
        ListArrays.sort(comparator);
        logger.debug("Arrays sorted successfully");
    }
}
