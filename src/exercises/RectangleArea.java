package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        double width;
        double area;

        System.out.println("Enter the length of the rectangle: ");
        length = input.nextDouble();

        System.out.println("Enter the rectangle's width: ");
        width = input.nextDouble();
        input.close();

        area = length * width;

        System.out.println("The area of the rectangle is " + area + ".");
    }
}
