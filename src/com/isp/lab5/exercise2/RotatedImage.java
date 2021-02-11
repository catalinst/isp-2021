package com.isp.lab5.exercise2;

public class RotatedImage implements Image {

    private final String fileName;

    public RotatedImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Display rotated " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
