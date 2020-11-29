package exercises;

import java.util.Scanner;

public class NumType {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?: ");
        Integer inputOne = input.nextInt();

        System.out.println("What is the width of the rectangle?: ");
        Integer inputTwo = input.nextInt();

        Integer area = inputOne * inputTwo;

        System.out.println("The area of your rectangle is: " + area);

    }
}
