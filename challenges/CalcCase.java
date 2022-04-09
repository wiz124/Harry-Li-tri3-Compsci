package challenges;

import challenges.calculator.Calculator;

import java.util.concurrent.TimeUnit;


//purpose of this is to clean up code and store hard coded test cases for calculator
public class CalcCase {
    public static void cases() throws InterruptedException {
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
    }
}
