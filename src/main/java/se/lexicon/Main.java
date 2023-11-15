package se.lexicon;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean runApp = true;
        System.out.println("Calculator");
        int num1;
        int num2;
        String operation;


        while (true) {

                //System.out.println("Do you want to quit the applicatiom");


            Scanner input = new Scanner(System.in);

            System.out.println("please enter the first number");
            num1 = input.nextInt();

            System.out.println("please enter the second number");
            num2 = input.nextInt();

            Scanner op = new Scanner(System.in);

            System.out.println("Please enter operation");
            //System.out.println("1 : Addition\n2 : Subtraction\n3 : Multiply\n4 : Divide\n0 : Exit");

            operation = op.next();

            if (operation.equals("+")) {
                System.out.println("your answer is " + (num1 + num2));
            } else if (operation.equals("-")) {
                System.out.println("your answer is " + (num1 - num2));
            } else if (operation.equals("/")) {
                System.out.println("your answer is " + (num1 / num2));
            } else if (operation.equals("*")) {
                System.out.println("your answer is " + (num1 * num2));
            } else {
                System.out.println("Wrong selection");
            }


            }


        }
    }