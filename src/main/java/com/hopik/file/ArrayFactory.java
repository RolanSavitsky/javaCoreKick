package com.hopik.file;

import com.hopik.entity.Entity;

public class ArrayFactory {
    public Entity create(int[] data) {
        return new Entity(data.clone());
    }
}
