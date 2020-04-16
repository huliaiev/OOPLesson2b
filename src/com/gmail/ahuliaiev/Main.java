package com.gmail.ahuliaiev;

/*
 * abstraktnyy klass
 * 
 */

public class Main {

    public static void main(String[] args) {

        Point a = new Point(0, 0);
        Point b = new Point(0, 6);
        Point c = new Point(5, 0);
        Point d = new Point(5, 7);

        Triangular trian = new Triangular(a, b, c);
        //Shape trian = new Triangular(a, b, c);
        Circle cir = new Circle(a, b);
        Rectangle rect = new Rectangle(a, b, c, d);

        System.out.println(trian.getPerimetr());
        System.out.println(trian.getArea());

        System.out.println(rect.getPerimetr());
        System.out.println(rect.getArea());

        System.out.println(cir.getPerimetr());
        System.out.println(cir.getArea());
    }
}