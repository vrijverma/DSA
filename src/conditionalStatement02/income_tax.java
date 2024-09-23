package conditionalStatement02;

import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    double tax = 0.0f;
        System.out.println("Enter your income :");
        double income = sc.nextDouble();

        // calculation tax
        if(income<500000)
        {
           tax = 0.0;
        }
        else if(income>=500000 && income<1000000)
        {
            tax = income*(0.2);
        }
        else {
            tax = income * (0.3);
        }
        System.out.println("Your tax is :"+tax);
    }
}
