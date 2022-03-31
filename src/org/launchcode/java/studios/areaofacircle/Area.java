package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of your circle? ");
        double radius;
        radius = input.nextDouble();

        // 1 - add validation for if a user enters a negative number
       if(radius < 0){
           System.out.println("The chosen radius is invalid");
       } else {
           Double area = Circle.getArea(radius);
           System.out.println("The area of your circle with radius " + radius + " is: " + area);
       }

        // 2 - extend validation with while loop

        // 3 - extend validation with do-while loop


        input.close();

    }
}
