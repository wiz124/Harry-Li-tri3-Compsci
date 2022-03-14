# individual repository 
give me an A+

Repl: https://replit.com/@HarryLi11/individual#Main.java

### Review ticket:
Tech talk 0:
    - try catch block 
        code runs in try section, when an error occurs, catch block activates
        in this case, we create an error in order for the catch section to activiate in case a different selection occurs
        Use Exception e for catch all errors.
 ``` java
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

            //create an error for try catch block to activate and be useful
          else {
                String myString = null;
             System.out.println(myString.length());
               // System.out.println(options.length+1);
            }


        } catch(Exception e){
            System.out.println("Incorrect input");

        }
```
        
    - pass by value and pass by reference
