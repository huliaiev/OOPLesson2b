package com.gmail.ahuliaiev;

public class Triangular extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangular(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangular() {
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double a1 = a.getDistance(b);
        double b1 = b.getDistance(c);
        double c1 = c.getDistance(a);
        double polp = getPerimetr() / 2.0;
        return Math.sqrt(polp * (polp - a1) * (polp - b1) * (polp - c1));
    }

    @Override
    public double getPerimetr() {
        return a.getDistance(b) + b.getDistance(c) + c.getDistance(a);
    }

    @Override
    public String toString() {
        return "Triangular [a=" + a + ", b=" + b + ", c=" + c + "]";
    }
}