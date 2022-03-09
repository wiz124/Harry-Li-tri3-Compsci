package challenge;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
        String[] options = new String[] {"0)Quit", "1)Integer Swap", "2)2D Array Printer"};

    while (f) {



        try {
            TimeUnit.SECONDS.sleep(1);
            //prompt:
            System.out.println("\nMenu page: ");
            for(String i:options){
                System.out.println("------------");
                System.out.println(i);
            }
            System.out.println("Choose a program: ");
            selection = scan.nextLine();

            //checking selection
            //quit selection
            if (selection.equals( "0")) {
                break;
            }
            //intswap selection
            else if (selection.equals( "1")) {
                intswap object = new intswap();
                object.main();
                TimeUnit.SECONDS.sleep(3);

            }
            //array printer selection
            else if (selection.equals( "2")) {
                arrprint object2 = new arrprint();
                object2.main();
                TimeUnit.SECONDS.sleep(3);

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

