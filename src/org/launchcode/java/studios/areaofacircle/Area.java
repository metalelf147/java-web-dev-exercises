package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the radius of your circle (up to 7 decimal places)? : ");
            double radius = input.nextDouble();

            //double pi = 3.14;
            //double area = pi * radius * radius;


            System.out.println("The area of a circle of radius is " + Circle.getArea(radius));


    }

}
