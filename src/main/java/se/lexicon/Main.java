package se.lexicon;

import java.util.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Double number;
        System.out.println("Calculator");
        int num1;
        int num2;
        int scanner;
        boolean loop = true;
        String operation;


        Scanner input = new Scanner(System.in);


        //if (test == 0)




    //} while (willContinue);


            System.out.println("please enter the first number");
            num1 = input.nextInt();
            //int op =-1;


            System.out.println("please enter the second number");
            num2 = input.nextInt();


            System.out.println("Please enter operation");
            //System.out.println("1 : Addition\n2 : Subtraction\n3 : Multiply\n4 : Divide\n0 : Exit");


            operation = input.next();


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
            //while (true){
          //  int test = input.nextInt();
            //
            // int test2 = input.nextInt();
           boolean isTrue = true;

            while (isTrue) {

                System.out.println("Start? Press 5");
                System.out.println("Quit? Press 1");

                number = input.nextDouble();
                if (number == 5) {
                continue;


                } else if (number == 1)

                //isTrue = false;
                    System.out.println("Goodbye");
                    break;}





            //sum += number;
        }

                //System.out.println("Goodbye");
               // for (int i = 0; i < 10; i++) {
                //if (i == 4) {
                    //continue;




            //if (exit  5) continue;



                //System.out.println("Press 5 to continue");               //if (test == 0) break;{}

                /**  do {
                System.out.println("Continue? Press 5");

            } while(number  == 5); input.reset();

            do {
         // add only positive numbers
         sum += number;
         System.out.println("Quit Calculator? Press -1");
         number = input.nextInt();
         } while(number >= 0);
        //System.out.println("Sum = " + sum);
        input.close();



            //System.out.println("Press 0 to quit");

            //while(true) {

            //int value;
            //int op = -1;
            //int op =-1;
            //System.out.println("Press 0 to exit calculator");
            //if  (op==-1) {
            //break;
                 */
                }