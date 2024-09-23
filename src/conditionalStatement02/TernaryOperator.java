package conditionalStatement02;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no to check even or odd");

        int a = sc.nextInt();

        String result = (a%2==0)?"even":"odd";
        System.out.println("Given no is :"+result);
    }
}
