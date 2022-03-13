package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        double area;
        double radius;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

        area = Circle.getArea(radius);

        System.out.println("The area of a circle or radius " + radius + " is: " + area);

    }
}
