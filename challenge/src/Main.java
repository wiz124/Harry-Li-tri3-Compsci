import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        //menu for replit, use try catch block in development

        //initialize necessary var
        boolean f= true;
        int selection;
        Scanner scan =  new Scanner(System.in);

    //try catch block looped to make sure we get right response, otherwise quit program
    try {
        while (f) {
            System.out.println("Menu page:\n1)Integer Swapper\n2)2D Array Printer");
            System.out.println("Choose a program: ");

            selection = scan.nextInt();
            switch (selection) {
                case 1:
                    scan.close();
                    intswap object = new intswap();
                    object.main();
                    f = false;
                    break;
                case 2:
                    scan.close();
                    arrprint object2 = new arrprint();
                    object2.main();
                    f = false;
                    break;
            }

        }
    }
        catch(NumberFormatException e){
            System.out.println("Menu page:\n1)Integer Swapper\n2)2D Array Printer");
            System.out.println("Incorrect Selection. Please pick a number: ");
        }





    }
}
