package com.company;

import java.awt.*;

public class Circle extends Shape{

    private double radius;

    public Circle() {
    }

    public Circle(double radius, Color colour) {
        this.radius = radius;
        this.setColour(colour);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
