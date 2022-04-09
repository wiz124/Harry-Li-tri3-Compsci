

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import challenges.*;
import challenges.calculator.Calculator;
import challenges.sortalgo.*;


//challenge 1 completed
public class Main {

    public static void main(String[] args) {
        // menu for replit, use try catch block in development

        // initialize necessary variable
        boolean f = true;
        String selection;

        // while loop to loop through menu, waiting for exit program
        // try catch block looped to make sure we get right response, otherwise quit
        // program
        String[] options = new String[] { "0)Quit", "1)Integer Swap", "2)Matrix Printer", "3)Queue Fiddling",
                "4)Queue Merging", "5)Queue Reverse",
                "6)Hardcoded Calculator Cases", "7)Eval a Math Expression", "8) Sorting Algorithms" };

        String[] sortsmenu = new String[] { "1)bubble", "2)selection", "3)insertion", "4)merge" };
        Scanner scan = new Scanner(System.in);
        
        while (f) {

            try {
                // wait time for loop, allow reader to read prompts and results
                TimeUnit.SECONDS.sleep(1);
                scan = new Scanner(System.in);
                // prompt:
                System.out.println("\nMenu page: ");
                for (String i : options) {
                    System.out.println("------------");
                    System.out.println(i);
                }

                System.out.println("Choose a program: ");
                selection = scan.nextLine();

                // checking selections
                // quit programs
                if (selection.equals("0")) {
                    scan.close();
                    break;
                }
                // intswap selection
                else if (selection.equals("1")) {
                    IntByReference.menu();
                    TimeUnit.SECONDS.sleep(3);
                }
                // array printer selection
                else if (selection.equals("2")) {

                    Matrix m0 = new Matrix(Matrix.keypad());
                    System.out.println("Keypad:");
                    System.out.println(m0);

                    Matrix m1 = new Matrix(Matrix.numbers());
                    System.out.println("Numbers Systems:");
                    System.out.println(m1);
                    TimeUnit.SECONDS.sleep(3);

                } else if (selection.equals("3")) {
                    Object[] words = new String[] { "seven", "slimy", "snakes", "sallying", "slowly", "slithered",
                            "southward" };
                    new QueueManager("Words", words);

                } else if (selection.equals("4")) {
                    Queue result = MergeQueue.merge(MergeQueue.first(), MergeQueue.second());
                    System.out.println("1st Queue: " + MergeQueue.first());
                    System.out.println("2nd Queue: " + MergeQueue.second());
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Merged Queue: " + result);

                } else if (selection.equals("5")) {
                    System.out.println("Original queue: " + Astack.first());
                    Astack.reverse(Astack.first());
                }
                //hard coded calculator cases
                else if (selection.equals("6")) {
                    CalcCase.cases();
                    TimeUnit.SECONDS.sleep(1);

                } else if (selection.equals("7")) {
                    System.out.println("Enter a math expression to evaluate: ");
                    String input = scan.nextLine();

                    Calculator in = new Calculator(input);

                    System.out.println("Result\n" + in);

                    TimeUnit.SECONDS.sleep(1);

                } else if (selection.equals("8")) {


                    System.out.println("Choose a sort: ");
                    for(String i: sortsmenu){
                        System.out.println(i);
                    }
                    int a = scan.nextInt();
                    if(a==1 || a==2 || a ==3 || a==4) {
                        Main.sortmenu(a);
                    }
                    else{
                        System.out.println("Wrong input");
                    }
                }

                // create an error for try catch block to activate and be useful
                else {
                    String myString = null;
                    System.out.println(myString.length());
                    // System.out.println(options.length+1);
                }

            } catch (Exception e) {
                System.out.println("Incorrect input");

            }
        }
        System.out.println("Goodbye");
        scan.close();

    }


    //menu for sorting algorithm
    public static void sortmenu(int choice){
        int sum = 0, time = 0, TIMES = 12, SIZE = 5000;


        for (int i = 0; i < TIMES; i++) {
            //Sorts s = new Sorts(SIZE, choice);
            Allsort s = null;
if(choice==1){
    s = new bubblesort(SIZE);
}
else if(choice==2){
    s =  new selectionsort(SIZE);
}
else if(choice ==3){
    s = new Insertionsort(SIZE);
}
else if (choice == 4){
    s = new mergesort(SIZE);
}

            for (int j = 0; j < s.getData().size(); j++) {
                // To see data, uncomment next line
                   // System.out.println(s.getData());

                sum += s.getData().get(j);
            }
            System.out.println("Average random: " + sum / ((i + 1) * SIZE));
            System.out.println("Nanoseconds: " + s.getTimeElapsed());
            time += s.getTimeElapsed();
            System.out.println("Swaps: " + s.getSorts());
            System.out.println("Comparisons: " + s.getComparisons());
        }

        System.out.println("Average random: " + sum / (TIMES * SIZE));
        System.out.println("Total Nanoseconds: " + time);
        System.out.println("Total Seconds: " + time / 1000000000.0);

    }
}
