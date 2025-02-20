package com.directi.training.dip.exercise_refactor;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter implements IWriter {
    private final String filePath;
    
    public FileWriter(String filePath) {
        this.filePath = filePath;
    }
    
    @Override
    public void write(String data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(filePath))) {
            writer.write(data);
        }
    }
}