package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String args[]) {

        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales you mande this week!");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make decision on path to take - output
        if(sales >= quota)
        {
            System.out.println("Congrats!, You've met your quota");
        }
        else {
            System.out.println("Sorry, Quota did not meet quota");
        }


    }


}
