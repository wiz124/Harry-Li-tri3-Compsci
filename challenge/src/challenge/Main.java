package challenge;

import challenge.calculator.Calculator;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



//challenge 1 completed
public class Main {

    public static void main(String[] args){
        //menu for replit, use try catch block in development

        //initialize necessary var
        boolean f= true;
       String selection;




        //while loop to loop through menu, waiting for exit program
    //try catch block looped to make sure we get right response, otherwise quit program
        String[] options = new String[] {"0)Quit", "1)Integer Swap", "2)Matrix printer", "3)Queue fiddling", "4)Queue merging","5)Queue Reverse",
                "6)Calculator stack"};
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

                Matrix m0 = new Matrix(Matrix.keypad());
                System.out.println("Keypad:");
                System.out.println(m0);

                Matrix m1 = new Matrix(Matrix.numbers());
                System.out.println("Numbers Systems:");
                System.out.println(m1);
                TimeUnit.SECONDS.sleep(3);

            }
            else if (selection.equals("3")){
                Object[] words = new String[] { "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};
                new QueueManager("Words", words );
            }
            else if(selection.equals("4")){
                Queue result = mergeQueue.merge(mergeQueue.first(), mergeQueue.second());
                System.out.println("1st Queue: "+mergeQueue.first());
                System.out.println("2nd Queue: "+mergeQueue.second());
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Merged Queue: "+ result);
            }
            else if(selection.equals("5")){
                System.out.println("Original queue: " +astack.first().toString());
                astack.reverse(astack.first());
            }
            else if(selection.equals("6")){

                Calculator simpleMath = new Calculator("100 + 200  * 3");
                System.out.println("Simple Math\n" + simpleMath);

                TimeUnit.SECONDS.sleep(1);
                Calculator parenthesisMath = new Calculator("(100 + 200)  * 3");
                System.out.println("Parenthesis Math\n" + parenthesisMath);

                TimeUnit.SECONDS.sleep(1);
                Calculator allMath = new Calculator("200 % 300 + 5 + 300 / 200 + 1 * 100");
                System.out.println("All Math\n" + allMath);
                TimeUnit.SECONDS.sleep(1);

                Calculator allMath2 = new Calculator("200 % (300 + 5 + 300) / 200 + 1 * 100");
                System.out.println("All Math2\n" + allMath2);
                TimeUnit.SECONDS.sleep(1);

                Calculator allMath4 = new Calculator("(3) ^ 2 + 1");
                System.out.println("Exponents\n" + allMath4);
                TimeUnit.SECONDS.sleep(1);

                Calculator allMath3 = new Calculator("16 SQRT + 1");
                System.out.println("Square root\n" + allMath3);
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

