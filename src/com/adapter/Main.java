package com.adapter;

public class Main {

    public static void main(String[] args) {


        Shape sh1 = new Square();
        Shape sh2 = new CircleAdapter();
        Shape sh3 = new Rectangle();
        sh1.draw();
       sh2.draw();
        sh3.draw();
    }
}
