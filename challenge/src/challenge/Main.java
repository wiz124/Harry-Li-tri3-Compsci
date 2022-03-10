package challenge;
import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static challenge.IntByReference.*;
import static challenge.Matrix.*;

//challenge 1 completed
public class Main {

    public static void main(String[] args){
        //menu for replit, use try catch block in development

        //initialize necessary var
        boolean f= true;
       String selection;




        //while loop to loop through menu, waiting for exit program
    //try catch block looped to make sure we get right response, otherwise quit program
        String[] options = new String[] {"0)Quit", "1)Integer Swap", "2)Matrix printer"};
        Scanner scan =  new Scanner(System.in);
    while (f) {

        try {
            //wait time for loop, allow reader to read prompts and results
            TimeUnit.SECONDS.sleep(1);
            scan = new Scanner(System.in);
            //prompt:
            System.out.println("\nMenu page: ");
            for(String i:options){
                System.out.println("------------");
                System.out.println(i);
            }

            System.out.println("Choose a program: ");
            selection = scan.nextLine();

            //checking selections
            //quit programs
            if (selection.equals( "0")) {
                scan.close();
                break;
            }
            //intswap selection
            else if (selection.equals( "1")) {
                System.out.println("Enter an integer: ");
                int a = scan.nextInt();
                System.out.println("Enter an integer: ");
                int b = scan.nextInt();

                IntByReference.swapper(a,b);
                TimeUnit.SECONDS.sleep(3);
            }
            //array printer selection
            else if (selection.equals( "2")) {

                Matrix m0 = new Matrix(keypad());
                System.out.println("Keypad:");
                System.out.println(m0);

                Matrix m1 = new Matrix(numbers());
                System.out.println("Numbers Systems:");
                System.out.println(m1);
                TimeUnit.SECONDS.sleep(3);

            }

            //create an error for try catch block to activate and be useful
          else {
                String myString = null;
             System.out.println(myString.length());
               // System.out.println(options.length+1);
            }


        } catch(Exception e){
            System.out.println("Incorrect input");

        }

    }
    System.out.println("Goodbye");
        scan.close();

    }

}

