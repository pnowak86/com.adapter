package com.adapter;

/**
 * Created by Pinq on 2017-06-16.
 */
public class CircleAdapter implements Shape {
    private Circle circle = new Circle();

    @Override
    public void draw() {
        circle.drawCricle();
    }
}
