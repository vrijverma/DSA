package conditionalStatement02;
    //Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1- Monday");
        System.out.println("2- Tuesday");
        System.out.println("3- Wednesday");
        System.out.println("4- Thursday");
        System.out.println("5- Friday");
        System.out.println("6- Saturday");
        System.out.println("7- Sunday");
        System.out.println("8- exit");

        System.out.println("Select any one which we want ...");


        while (true) {

            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Wrong input!");

            }
            System.out.println("do you want to continue.....");

        }
    }
}
