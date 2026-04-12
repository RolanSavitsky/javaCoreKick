package com.hopik.file;

public class ParserFile {
    public int[] parse(String line){
        line = line.trim();
        if (line.isEmpty()){
            throw new IllegalArgumentException("Empty line");
        }

        String[] parts = line.split("\\s+");
        int[] nums = new int[parts.length];

        for (int i = 0; i < parts.length; i++){
            nums[i] = Integer.parseInt(parts[i]);
        }

        return nums;
    }
}
