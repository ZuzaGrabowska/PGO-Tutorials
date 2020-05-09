package com.company;

import java.awt.*;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length, Color colour) {
        this.width = width;
        this.length = length;
        this.setColour(colour);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
