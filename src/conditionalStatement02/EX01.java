package conditionalStatement02;
//Question 1 : Write a Java program to get a number from the user and print whether it is
//             positive or negative.

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}
