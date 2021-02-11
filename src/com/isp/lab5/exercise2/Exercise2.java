package com.isp.lab5.exercise2;

public class Exercise2 {

    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("rotated-image-file", "rotated");
        proxyImage.display();
        proxyImage.display();
        proxyImage.display();

        ProxyImage proxyImage1 = new ProxyImage("real-image-file", "real");
        proxyImage1.display();
        proxyImage1.display();
    }
}
