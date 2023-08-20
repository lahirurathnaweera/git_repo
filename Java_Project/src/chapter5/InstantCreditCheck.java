package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

     double salary = getSalary();

     int creditScore = getCreditSciore();

     boolean qualified = isUserQualified( creditScore, salary);

     notifyUser(qualified);

     scanner.close();
    }

    public static double getSalary(){
        System.out.println("Enyer your Salary");

        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditSciore(){
        System.out.println("Enter yuor credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }


    public static boolean isUserQualified(int creditScore, double salary){

        if (creditScore >= requiredCreditScore && salary >= requiredSalary)
        {
            return true ;
        }
        else
        {
            return false;
        }

    }

    public static void notifyUser(boolean isQualified)
    {
        if(isQualified)
        {
            System.out.println("Congrats! You have been approved");
        }
        else
        {
            System.out.println("Sorry, You have been declined");
        }
    }




}
