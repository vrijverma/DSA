package conditionalStatement02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b values :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("select any one operation that we want to execute :");
        System.out.println("+ => a+b");
        System.out.println("- => a-b");
        System.out.println("* => a*b");
        System.out.println("/ => a/b");
        System.out.println("% => a%b");


        char operator = sc.next().charAt(0);
        switch(operator)
        {
            case '+':
                System.out.println("a+b :"+(a+b));
                break;
            case '-':
                System.out.println("a-b :"+(a-b));
                break;
            case '*':
                System.out.println("a*b :"+(a*b));
                break;
            case '/':
                System.out.println("a/b :"+(a/b));
                break;
            case '%':
                System.out.println("a%b :"+(a%b));
                break;

            default :
                System.out.println("wrong input");
        }
    }
}
