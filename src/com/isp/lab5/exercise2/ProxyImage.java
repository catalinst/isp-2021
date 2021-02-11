package com.isp.lab5.exercise2;

public class ProxyImage implements Image {

    private Image image;
    private final String fileName;
    private final String type;

    public ProxyImage(String fileName, String type) {
        this.fileName = fileName;
        this.type = type;
    }

    @Override
    public void display() {
        if (image == null) {
            if (type.equals("real")) {
                image = new RealImage(fileName);
            } else {
                image = new RotatedImage(fileName);
            }
        }
        image.display();
    }
}