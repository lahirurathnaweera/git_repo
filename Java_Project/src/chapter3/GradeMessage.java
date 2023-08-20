package chapter3;

import java.util.Scanner;

public class GradeMessage {

    public static void main(String args[])
    {
        System.out.println("Enter your letter grade :");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade){

            case "A":
             message = "Excellent job";
             break;
            case "B":
             message = "Great Job";
             break;
            case "C":
             message = "Good job";
             break;
            case "D":
             message = "You need to work bit a hard";
             break;
            case "F":
             message = "Uh Oh";
             break;
            default:
             message ="Error";
             break;
        }

      System.out.println(message);


    }




}
