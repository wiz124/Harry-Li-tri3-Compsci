p
import java.util.Scanner;

//challenge 1 completed
public class Main {

    public static void main(String[] args){
        //menu for replit, use try catch block in development

        //initialize necessary var
        boolean f= true;
       String selection;
        Scanner scan =  new Scanner(System.in);



        //while loop to loop through menu, waiting for exit program
    //try catch block looped to make sure we get right response, otherwise quit program
    while (f) {



        try {
            //prompt:
            System.out.println("\nMenu page:\n0)Quit\n1)Integer Swapper\n2)2D Array Printer");
            System.out.println("Choose a program: ");
            selection = scan.nextLine();

            //checking selection
            if (selection.equals( "0")) {
              //  f=false;
                break;
            }
            else if (selection.equals( "1")) {
              
                intswap.main();

            }
            else if (selection.equals( "2")) {
                arrprint object2 = new arrprint();
                object2.main();

            }

            //create an error for try catch block to activate and be useful
            else {
                String myString = null;
                System.out.println(myString.length());
            }


        }

        catch (Exception e) {
            //reprompt
            System.out.println("Incorrect Selection. Must pick number from menu.");
        }
        }
    System.out.println("Goodbye");
    scan.close();
    }




    }

