package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter7=0;
        int counter17=0;
        int counter23=0;
        int counterUser=0;
        int UserNumber;

        Scanner Keyboard = new Scanner(System.in);
        boolean exit = false;
        int num;

        System.out.println("Please Enter a delimiter number: ");

        //Validation of User Input
        do {
            num = Keyboard.nextInt();
            if (num > 1)
                exit = true;

            else
                System.out.println("Please Enter a Number Greater Than 1: ");

        }
        while (!exit);

        //Prompting User to Enter a Number to Count
        System.out.println("Enter a Number to Count: ");
        UserNumber = Keyboard.nextInt();


        //Determining the multiples
        int counter =1;

        while (counter <=num){
        if ((counter % 3!=0) && (counter %5!=0))
            System.out.println(counter);


        if ((counter % 3==0)&& (counter % 5==0))
            System.out.println("FizzBuzz");
        else if (counter % 3==0)
            System.out.println("Fizz");
        else if (counter % 5==0)
            System.out.println("Buzz");

        if (counter % 7==0)
            counter7++;
        if (counter % 17==0)
            counter17++;
        if (counter % 23==0)
            counter23++;
        if (counter % UserNumber==0)
            counterUser++;

            counter++;
        }

        // Displaying the number multiples
        System.out.println();
        System.out.println("Number of Multiples of 7s  in " +num+ " : " +counter7);
        System.out.println("Number of Multiples of 17s in " +num+ " : " +counter17);
        System.out.println("Number of Multiples of 23s in " +num+ " : " +counter23);
        System.out.println("Number of Multiples of "+ UserNumber +"s in " +num+ " : "+counterUser);
    }
}